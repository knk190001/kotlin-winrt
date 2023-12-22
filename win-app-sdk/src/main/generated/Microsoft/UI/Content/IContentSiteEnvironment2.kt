package Microsoft.UI.Content

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentSiteEnvironment2.ABI::class)
@Signature("{727fde51-6960-54e4-a957-d83e17171b75}")
@Guid("727fde51696054e4a957d83e17171b75")
@WinRTInterface("727fde51696054e4a957d83e17171b75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteEnvironment2.ByReference::class)
public interface IContentSiteEnvironment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentOrientation(): ContentDisplayOrientations?

  @InterfaceMethod(1)
  public fun put_CurrentOrientation(value: ContentDisplayOrientations?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayScale(): Float

  @InterfaceMethod(3)
  public fun put_DisplayScale(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_NativeOrientation(): ContentDisplayOrientations?

  @InterfaceMethod(5)
  public fun put_NativeOrientation(value: ContentDisplayOrientations?): Unit

  @InterfaceMethod(6)
  public fun NotifyThemeChanged(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteEnvironment2> {
    public override fun getValue() = ABI.makeIContentSiteEnvironment2(pointer.getPointer(0))

    public fun setValue(value: IContentSiteEnvironment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteEnvironment2 {
    public val __103754603_Ptr: Pointer?

    public val _103754603_VtblPtr: Pointer?
      get() = __103754603_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentOrientation(): ContentDisplayOrientations? {
      val fnPtr = _103754603_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CurrentOrientation(value: ContentDisplayOrientations?): Unit {
      val fnPtr = _103754603_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayScale(): Float {
      val fnPtr = _103754603_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DisplayScale(value: Float): Unit {
      val fnPtr = _103754603_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_NativeOrientation(): ContentDisplayOrientations? {
      val fnPtr = _103754603_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_NativeOrientation(value: ContentDisplayOrientations?): Unit {
      val fnPtr = _103754603_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun NotifyThemeChanged(): Unit {
      val fnPtr = _103754603_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__103754603_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentSiteEnvironment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103754603_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteEnvironment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("727fde51696054e4a957d83e17171b75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteEnvironment2(ptr: Pointer?): WithDefault =
        IContentSiteEnvironment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteEnvironment2 {
      val address = segment.toRawLongValue()
      return makeIContentSiteEnvironment2(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteEnvironment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103754603_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteEnvironment2):
        Array<IContentSiteEnvironment2?> = (elements as
        Array<IContentSiteEnvironment2?>).castToImpl<IContentSiteEnvironment2,IContentSiteEnvironment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteEnvironment2?> =
        arrayOfNulls<IContentSiteEnvironment2_Impl>(size) as Array<IContentSiteEnvironment2?>
  }
}
