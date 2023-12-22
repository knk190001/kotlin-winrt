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
@ABIMarker(IObservableVector.ABI::class)
@Guid("5917eb5350b44a0db30965862b3f1dbc")
@WinRTByReference(IObservableVector.ByReference::class)
@TypeHash("__1493305514_Type")
public interface IObservableVector<T> : NativeMapped, IWinRTInterface, IVector<T> {
  public val __1493305514_Ptr: Pointer?

  public val _1493305514_VtblPtr: Pointer?
    get() = __1493305514_Ptr?.getPointer(0)

  public val __1493305514_Type: KType?

  public override val __1070388601_Type: KType
    get() = IVector::class.createType(listOf(
      __1493305514_Type!!.arguments[0],
    ))

  public fun add_VectorChanged(vhnd: VectorChangedEventHandler<T>?): EventRegistrationToken? {
    if (__1493305514_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1493305514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<EventRegistrationToken.ByValue>()
    val hr = fn.invokeHR(arrayOf(__1493305514_Ptr,marshalToNative(vhnd),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = EventRegistrationToken.ByValue::class.createType()
    return marshalFromNative<EventRegistrationToken>(result.getValue(), returnType!!)
  }

  public fun remove_VectorChanged(token: EventRegistrationToken?): Unit {
    if (__1493305514_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1493305514_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1493305514_Ptr,marshalToNative(token)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObservableVector<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IObservableVector<T> =
        ABI.makeIObservableVector<T>(pointer.getPointer(0), type!!)

    public fun setValue(value: IObservableVector<T>): Unit {
      pointer = value.__1493305514_Ptr!!
    }
  }

  public class IObservableVectorImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __1493305514_Type: KType? = null
  ) : PointerType(ptr), IObservableVector<T> {
    public override val __1493305514_Ptr: JNAPointer?
      get() = pointer

    public override val _1493305514_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1070388601_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1070388601_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1493305514_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf(__1449643190_Type))
      val result = PointerByReference()
      IUnknownVtbl(_1493305514_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IObservableVector<T> =
          IObservableVectorImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IObservableVector<T> =
          IObservableVectorImpl(typeOf<IObservableVector<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IObservableVector<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIObservableVector(ptr: JNAPointer?, type: KType) =
        IObservableVectorImpl<T>(type, ptr)

    public inline fun <reified T> makeIObservableVector(ptr: JNAPointer?) =
        IObservableVectorImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IObservableVector<*> {
      val address = segment.toRawLongValue()
      return makeIObservableVector<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IObservableVector<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1493305514_Ptr))
  }
}
