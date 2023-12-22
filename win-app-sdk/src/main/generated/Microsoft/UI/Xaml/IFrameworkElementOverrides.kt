package Microsoft.UI.Xaml

import Windows.Foundation.Size
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameworkElementOverrides.ABI::class)
@Signature("{ffc6fd98-f38c-5904-9ce4-97a3427cf4ba}")
@Guid("ffc6fd98f38c59049ce497a3427cf4ba")
@WinRTInterface("ffc6fd98f38c59049ce497a3427cf4ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementOverrides.ByReference::class)
public interface IFrameworkElementOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MeasureOverride(availableSize: Size?): Size?

  @InterfaceMethod(1)
  public fun ArrangeOverride(finalSize: Size?): Size?

  @InterfaceMethod(2)
  public fun OnApplyTemplate(): Unit

  @InterfaceMethod(3)
  public fun GoToElementStateCore(stateName: String?, useTransitions: Boolean): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementOverrides> {
    public override fun getValue() = ABI.makeIFrameworkElementOverrides(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementOverrides {
    public val __696076866_Ptr: Pointer?

    public val _696076866_VtblPtr: Pointer?
      get() = __696076866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MeasureOverride(availableSize: Size?): Size? {
      val fnPtr = _696076866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__696076866_Ptr, marshalToNative(availableSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ArrangeOverride(finalSize: Size?): Size? {
      val fnPtr = _696076866_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__696076866_Ptr, marshalToNative(finalSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun OnApplyTemplate(): Unit {
      val fnPtr = _696076866_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__696076866_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GoToElementStateCore(stateName: String?, useTransitions: Boolean): Boolean {
      val fnPtr = _696076866_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__696076866_Ptr, marshalToNative(stateName), useTransitions,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameworkElementOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696076866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffc6fd98f38c59049ce497a3427cf4ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementOverrides(ptr: Pointer?): WithDefault =
        IFrameworkElementOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementOverrides {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementOverrides(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696076866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementOverrides):
        Array<IFrameworkElementOverrides?> = (elements as
        Array<IFrameworkElementOverrides?>).castToImpl<IFrameworkElementOverrides,IFrameworkElementOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementOverrides?> =
        arrayOfNulls<IFrameworkElementOverrides_Impl>(size) as Array<IFrameworkElementOverrides?>
  }
}
