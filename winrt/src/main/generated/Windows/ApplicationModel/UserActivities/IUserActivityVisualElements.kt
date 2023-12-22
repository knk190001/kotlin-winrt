package Windows.ApplicationModel.UserActivities

import Windows.UI.Color
import Windows.UI.Shell.IAdaptiveCard
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserActivityVisualElements.ABI::class)
@Signature("{94757513-262f-49ef-bbbf-9b75d2e85250}")
@Guid("94757513262f49efbbbf9b75d2e85250")
@WinRTInterface("94757513262f49efbbbf9b75d2e85250")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityVisualElements.ByReference::class)
public interface IUserActivityVisualElements : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayText(): String?

  @InterfaceMethod(1)
  public fun put_DisplayText(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(5)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(6)
  public fun get_Attribution(): UserActivityAttribution?

  @InterfaceMethod(7)
  public fun put_Attribution(value: UserActivityAttribution?): Unit

  @InterfaceMethod(8)
  public fun put_Content(value: IAdaptiveCard?): Unit

  @InterfaceMethod(9)
  public fun get_Content(): IAdaptiveCard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityVisualElements> {
    public override fun getValue() = ABI.makeIUserActivityVisualElements(pointer.getPointer(0))

    public fun setValue(value: IUserActivityVisualElements_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityVisualElements {
    public val __1947743096_Ptr: Pointer?

    public val _1947743096_VtblPtr: Pointer?
      get() = __1947743096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayText(): String? {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayText(value: String?): Unit {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Attribution(): UserActivityAttribution? {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityAttribution>()
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityAttribution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Attribution(value: UserActivityAttribution?): Unit {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun put_Content(value: IAdaptiveCard?): Unit {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Content(): IAdaptiveCard? {
      val fnPtr = _1947743096_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAdaptiveCard>()
      val hr = fn.invokeHR(arrayOf(__1947743096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAdaptiveCard>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityVisualElements_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1947743096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityVisualElements, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94757513262f49efbbbf9b75d2e85250")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityVisualElements(ptr: Pointer?): WithDefault =
        IUserActivityVisualElements_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityVisualElements {
      val address = segment.toRawLongValue()
      return makeIUserActivityVisualElements(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityVisualElements): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1947743096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityVisualElements):
        Array<IUserActivityVisualElements?> = (elements as
        Array<IUserActivityVisualElements?>).castToImpl<IUserActivityVisualElements,IUserActivityVisualElements_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityVisualElements?> =
        arrayOfNulls<IUserActivityVisualElements_Impl>(size) as Array<IUserActivityVisualElements?>
  }
}
