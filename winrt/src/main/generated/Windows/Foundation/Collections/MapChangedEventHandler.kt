package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.interop.runtimeFromNativeJF
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toFunctionDescriptor
import com.github.knk190001.winrtbinding.runtime.transformParameterizedHandle
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

public fun interface MapChangedEventHandlerBody<K, V> {
  public operator fun invoke(sender: IObservableMap<K, V>?, event: IMapChangedEventArgs<K>?): Unit
}

@ABIMarker(MapChangedEventHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("179517f394ee41f8bddc768a895544f3")
@WinRTByReference(MapChangedEventHandler.ByReference::class)
public class MapChangedEventHandler<K, V>(
  public val type: KType? = null,
  public val body: MapChangedEventHandlerBody<K, V>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(sender: IObservableMap<K, V>, event: IMapChangedEventArgs<K>): Unit {
    body!!(sender, event)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( MapChangedEventHandler::class.java, "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, MapChangedEventHandlerBody::class.java, MemoryAddress::class.java,
            MemoryAddress::class.java, MemoryAddress::class.java, )

      )

    public inline operator fun <reified K, reified V> invoke(fn: MapChangedEventHandlerBody<K, V>):
        MapChangedEventHandler<K, V> {
      val session = MemorySession.global()
      val handleDescriptorPair = transformParameterizedHandle(typeOf<MapChangedEventHandler<K,
          V>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = MapChangedEventHandler(typeOf<MapChangedEventHandler<K, V>>(), fn,
          Memory(12))
      val guid = guidOf<MapChangedEventHandler<K, V>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <K, V> invoke(type: KType, ptr: Pointer?): MapChangedEventHandler<K, V> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: MapChangedEventHandlerBody<K, V> = MapChangedEventHandlerBody<K, V>  {
        sender, event ->
        val sender_Native = sender!!.toNative() as Pointer
        val event_Native = event!!.toNative() as Pointer
        val hr = function.invokeHR(arrayOf(thisPtr, sender_Native, event_Native))
        checkHR(hr)
      }
      return MapChangedEventHandler(type, body, thisPtr)
    }

    public inline operator fun <reified K, reified V> invoke(pointer: Pointer?):
        MapChangedEventHandler<K, V> {
      val type = typeOf<MapChangedEventHandler<K, V>>()
      return MapChangedEventHandler(type, pointer)
    }

    @JvmStatic
    public fun <K, V> nativeFn(
      type: KType,
      fn: MapChangedEventHandlerBody<K, V>,
      thisPtr: MemoryAddress,
      sender: MemoryAddress,
      event: MemoryAddress
    ): Int {
      try {
        val sender_Type = Windows.Foundation.Collections.IObservableMap::class.createType(listOf(
              type!!.arguments[0],
              type!!.arguments[1],
            ))
        val sender_Managed = IObservableMap.ABI.makeIObservableMap<K,
            V>(Pointer(sender.toRawLongValue()), sender_Type)
        val event_Type =
            Windows.Foundation.Collections.IMapChangedEventArgs::class.createType(listOf(
              type!!.arguments[0],
            ))
        val event_Managed =
            IMapChangedEventArgs.ABI.makeIMapChangedEventArgs<K>(Pointer(event.toRawLongValue()),
            event_Type)
        fn(sender_Managed, event_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<K, V> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapChangedEventHandler<K, V>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): MapChangedEventHandler<K, V> = MapChangedEventHandler<K,
        V>(type!!, pointer.getPointer(0))

    public fun setValue(value: MapChangedEventHandler<K, V>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<MapChangedEventHandler<*, *>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress): MapChangedEventHandler<*,
        *> {
      val address = segment.toRawLongValue()
      return MapChangedEventHandler<Unit, Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: MapChangedEventHandler<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
