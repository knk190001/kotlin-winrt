package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.platform.win32.WinDef
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IIterator.ABI::class)
@Guid("6a79e8634300459a9966cbb660963ee1")
@WinRTByReference(IIterator.ByReference::class)
@TypeHash("__1449660594_Type")
public interface IIterator<T> : NativeMapped, IWinRTInterface {
  public val __1449660594_Ptr: Pointer?

  public val _1449660594_VtblPtr: Pointer?
    get() = __1449660594_Ptr?.getPointer(0)

  public val __1449660594_Type: KType?

  public fun get_Current(): T {
    if (__1449660594_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1449660594_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<T>(__1449660594_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1449660594_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1449660594_Type!!.arguments[0]
    return marshalFromNative<T>(result.getValue(), returnType.type!!)as T
  }

  public fun get_HasCurrent(): Boolean {
    if (__1449660594_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1449660594_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr = fn.invokeHR(arrayOf(__1449660594_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun MoveNext(): Boolean {
    if (__1449660594_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1449660594_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<Boolean>()
    val hr = fn.invokeHR(arrayOf(__1449660594_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = Boolean::class.createType()
    return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
  }

  public fun GetMany(items: Array<T>): WinDef.UINT {
    if (__1449660594_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1449660594_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<WinDef.UINT>()
    val hr =
        fn.invokeHR(arrayOf(__1449660594_Ptr,marshalToNative(items,__1449660594_Type!!.arguments[0].type!!),result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = WinDef.UINT::class.createType()
    return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIterator<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IIterator<T> = ABI.makeIIterator<T>(pointer.getPointer(0),
        type!!)

    public fun setValue(value: IIterator<T>): Unit {
      pointer = value.__1449660594_Ptr!!
    }
  }

  public class IIteratorImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __1449660594_Type: KType? = null
  ) : PointerType(ptr), IIterator<T> {
    public override val __1449660594_Ptr: JNAPointer?
      get() = pointer

    public override val _1449660594_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IIterator<T> =
          IIteratorImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IIterator<T> =
          IIteratorImpl(typeOf<IIterator<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IIterator<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIIterator(ptr: JNAPointer?, type: KType) = IIteratorImpl<T>(type, ptr)

    public inline fun <reified T> makeIIterator(ptr: JNAPointer?) = IIteratorImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IIterator<*> {
      val address = segment.toRawLongValue()
      return makeIIterator<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IIterator<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1449660594_Ptr))
  }
}
