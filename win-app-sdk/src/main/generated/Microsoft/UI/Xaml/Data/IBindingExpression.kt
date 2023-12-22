package Microsoft.UI.Xaml.Data

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindingExpression.ABI::class)
@Signature("{4c023916-37bc-5b07-bc9d-15c547bd9b26}")
@Guid("4c02391637bc5b07bc9d15c547bd9b26")
@WinRTInterface("4c02391637bc5b07bc9d15c547bd9b26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingExpression.ByReference::class)
public interface IBindingExpression : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataItem(): IUnknown?

  @InterfaceMethod(1)
  public fun get_ParentBinding(): Binding?

  @InterfaceMethod(2)
  public fun UpdateSource(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingExpression> {
    public override fun getValue() = ABI.makeIBindingExpression(pointer.getPointer(0))

    public fun setValue(value: IBindingExpression_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingExpression {
    public val __196369930_Ptr: Pointer?

    public val _196369930_VtblPtr: Pointer?
      get() = __196369930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataItem(): IUnknown? {
      val fnPtr = _196369930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__196369930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParentBinding(): Binding? {
      val fnPtr = _196369930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Binding>()
      val hr = fn.invokeHR(arrayOf(__196369930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Binding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UpdateSource(): Unit {
      val fnPtr = _196369930_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__196369930_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBindingExpression_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __196369930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingExpression, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c02391637bc5b07bc9d15c547bd9b26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingExpression(ptr: Pointer?): WithDefault = IBindingExpression_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingExpression {
      val address = segment.toRawLongValue()
      return makeIBindingExpression(Pointer(address))
    }

    public override fun toNative(obj: IBindingExpression): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__196369930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingExpression): Array<IBindingExpression?> =
        (elements as
        Array<IBindingExpression?>).castToImpl<IBindingExpression,IBindingExpression_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingExpression?> =
        arrayOfNulls<IBindingExpression_Impl>(size) as Array<IBindingExpression?>
  }
}
