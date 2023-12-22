package Windows.Foundation.Collections

import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IObservableMap.ABI::class)
@Guid("65df2bf5bf3941b5aebc5a9d865e472b")
@WinRTByReference(IObservableMap.ByReference::class)
@TypeHash("__1606815573_Type")
public interface IObservableMap<K, V> : NativeMapped, IWinRTInterface, IMap<K, V> {
  public val __1606815573_Ptr: Pointer?

  public val _1606815573_VtblPtr: Pointer?
    get() = __1606815573_Ptr?.getPointer(0)

  public val __1606815573_Type: KType?

  public override val __8028824_Type: KType
    get() = IMap::class.createType(listOf(
      __1606815573_Type!!.arguments[0],
      __1606815573_Type!!.arguments[1],
    ))

  public fun add_MapChanged(vhnd: MapChangedEventHandler<K, V>?): EventRegistrationToken? {
    if (__1606815573_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1606815573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<EventRegistrationToken.ByValue>()
    val hr = fn.invokeHR(arrayOf(__1606815573_Ptr,marshalToNative(vhnd),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = EventRegistrationToken.ByValue::class.createType()
    return marshalFromNative<EventRegistrationToken>(result.getValue(), returnType!!)
  }

  public fun remove_MapChanged(token: EventRegistrationToken?): Unit {
    if (__1606815573_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1606815573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1606815573_Ptr,marshalToNative(token)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<K, V> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObservableMap<K, V>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IObservableMap<K, V> = ABI.makeIObservableMap<K,
        V>(pointer.getPointer(0), type!!)

    public fun setValue(value: IObservableMap<K, V>): Unit {
      pointer = value.__1606815573_Ptr!!
    }
  }

  public class IObservableMapImpl<K, V>(
    ptr: JNAPointer? = NULL,
    public override var __1606815573_Type: KType? = null
  ) : PointerType(ptr), IObservableMap<K, V> {
    public override val __1606815573_Ptr: JNAPointer?
      get() = pointer

    public override val _1606815573_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __8028824_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__8028824_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1606815573_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1606815573_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <K, V> invoke(type: KType, ptr: JNAPointer?): IObservableMap<K, V> =
          IObservableMapImpl(ptr, type)

      public inline operator fun <reified K, reified V> invoke(ptr: JNAPointer?): IObservableMap<K,
          V> = IObservableMapImpl(typeOf<IObservableMap<K, V>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IObservableMap<*, *>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <K, V> makeIObservableMap(ptr: JNAPointer?, type: KType) = IObservableMapImpl<K,
        V>(type, ptr)

    public inline fun <reified K, reified V> makeIObservableMap(ptr: JNAPointer?) =
        IObservableMapImpl.invoke<K, V>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IObservableMap<*, *> {
      val address = segment.toRawLongValue()
      return makeIObservableMap<Unit, Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IObservableMap<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1606815573_Ptr))
  }
}
