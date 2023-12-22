package Windows.UI.Xaml.Input

import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IXamlUICommandStatics.ABI::class)
@Signature("{66bc457c-1a0c-58ed-876e-71533f966db6}")
@Guid("66bc457c1a0c58ed876e71533f966db6")
@WinRTInterface("66bc457c1a0c58ed876e71533f966db6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUICommandStatics.ByReference::class)
public interface IXamlUICommandStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_KeyboardAcceleratorsProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AccessKeyProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_DescriptionProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CommandProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUICommandStatics> {
    public override fun getValue() = ABI.makeIXamlUICommandStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlUICommandStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUICommandStatics {
    public val __1779722292_Ptr: Pointer?

    public val _1779722292_VtblPtr: Pointer?
      get() = __1779722292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyboardAcceleratorsProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CommandProperty(): DependencyProperty? {
      val fnPtr = _1779722292_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1779722292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUICommandStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1779722292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUICommandStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66bc457c1a0c58ed876e71533f966db6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUICommandStatics(ptr: Pointer?): WithDefault =
        IXamlUICommandStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUICommandStatics {
      val address = segment.toRawLongValue()
      return makeIXamlUICommandStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlUICommandStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1779722292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUICommandStatics): Array<IXamlUICommandStatics?> =
        (elements as
        Array<IXamlUICommandStatics?>).castToImpl<IXamlUICommandStatics,IXamlUICommandStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUICommandStatics?> =
        arrayOfNulls<IXamlUICommandStatics_Impl>(size) as Array<IXamlUICommandStatics?>
  }
}
