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
@ABIMarker(IIterable.ABI::class)
@Guid("faa585ea62144217afda7f46de5869b3")
@WinRTByReference(IIterable.ByReference::class)
@TypeHash("__1449643190_Type")
public interface IIterable<T> : NativeMapped, IWinRTInterface {
  public val __1449643190_Ptr: Pointer?

  public val _1449643190_VtblPtr: Pointer?
    get() = __1449643190_Ptr?.getPointer(0)

  public val __1449643190_Type: KType?

  public fun First(): IIterator<T>? {
    if (__1449643190_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1449643190_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<IIterator<T>>(
    IIterator::class.createType(listOf(
      __1449643190_Type!!.arguments[0],
    )))
    val hr = fn.invokeHR(arrayOf(__1449643190_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = IIterator::class.createType(listOf(
      __1449643190_Type!!.arguments[0],
    ))
    return marshalFromNative<IIterator<T>>(result.getValue(), returnType!!)
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIterable<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IIterable<T> = ABI.makeIIterable<T>(pointer.getPointer(0),
        type!!)

    public fun setValue(value: IIterable<T>): Unit {
      pointer = value.__1449643190_Ptr!!
    }
  }

  public class IIterableImpl<T>(
    ptr: JNAPointer? = NULL,
    public override var __1449643190_Type: KType? = null
  ) : PointerType(ptr), IIterable<T> {
    public override val __1449643190_Ptr: JNAPointer?
      get() = pointer

    public override val _1449643190_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public companion object {
      public operator fun <T> invoke(type: KType, ptr: JNAPointer?): IIterable<T> =
          IIterableImpl(ptr, type)

      public inline operator fun <reified T> invoke(ptr: JNAPointer?): IIterable<T> =
          IIterableImpl(typeOf<IIterable<T>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IIterable<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <T> makeIIterable(ptr: JNAPointer?, type: KType) = IIterableImpl<T>(type, ptr)

    public inline fun <reified T> makeIIterable(ptr: JNAPointer?) = IIterableImpl.invoke<T>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IIterable<*> {
      val address = segment.toRawLongValue()
      return makeIIterable<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IIterable<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1449643190_Ptr))
  }
}
