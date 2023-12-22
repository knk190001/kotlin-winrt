package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ICommandBarStatics.ABI::class)
@Signature("{4ed65848-4c67-588f-9666-11ff56d76f02}")
@Guid("4ed658484c67588f966611ff56d76f02")
@WinRTInterface("4ed658484c67588f966611ff56d76f02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarStatics.ByReference::class)
public interface ICommandBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryCommandsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SecondaryCommandsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CommandBarOverflowPresenterStyleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DefaultLabelPositionProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_OverflowButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsDynamicOverflowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarStatics> {
    public override fun getValue() = ABI.makeICommandBarStatics(pointer.getPointer(0))

    public fun setValue(value: ICommandBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarStatics {
    public val __1049238794_Ptr: Pointer?

    public val _1049238794_VtblPtr: Pointer?
      get() = __1049238794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryCommandsProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SecondaryCommandsProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CommandBarOverflowPresenterStyleProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultLabelPositionProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OverflowButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsDynamicOverflowEnabledProperty(): DependencyProperty? {
      val fnPtr = _1049238794_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1049238794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049238794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ed658484c67588f966611ff56d76f02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarStatics(ptr: Pointer?): WithDefault = ICommandBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarStatics {
      val address = segment.toRawLongValue()
      return makeICommandBarStatics(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049238794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarStatics): Array<ICommandBarStatics?> =
        (elements as
        Array<ICommandBarStatics?>).castToImpl<ICommandBarStatics,ICommandBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarStatics?> =
        arrayOfNulls<ICommandBarStatics_Impl>(size) as Array<ICommandBarStatics?>
  }
}
