package Microsoft.Web.WebView2.Core

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2WindowFeatures.ABI::class)
@Signature("{ee8686d6-056f-5e06-824f-4e2a24c1c1d6}")
@Guid("ee8686d6056f5e06824f4e2a24c1c1d6")
@WinRTInterface("ee8686d6056f5e06824f4e2a24c1c1d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WindowFeatures.ByReference::class)
public interface ICoreWebView2WindowFeatures : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasPosition(): Boolean

  @InterfaceMethod(1)
  public fun get_HasSize(): Boolean

  @InterfaceMethod(2)
  public fun get_Left(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Top(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_ShouldDisplayMenuBar(): Boolean

  @InterfaceMethod(7)
  public fun get_ShouldDisplayStatus(): Boolean

  @InterfaceMethod(8)
  public fun get_ShouldDisplayToolbar(): Boolean

  @InterfaceMethod(9)
  public fun get_ShouldDisplayScrollBars(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WindowFeatures> {
    public override fun getValue() = ABI.makeICoreWebView2WindowFeatures(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WindowFeatures_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WindowFeatures {
    public val __365338228_Ptr: Pointer?

    public val _365338228_VtblPtr: Pointer?
      get() = __365338228_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasPosition(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HasSize(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Left(): WinDef.UINT {
      val fnPtr = _365338228_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Top(): WinDef.UINT {
      val fnPtr = _365338228_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _365338228_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _365338228_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ShouldDisplayMenuBar(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ShouldDisplayStatus(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_ShouldDisplayToolbar(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_ShouldDisplayScrollBars(): Boolean {
      val fnPtr = _365338228_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365338228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2WindowFeatures_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __365338228_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WindowFeatures, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee8686d6056f5e06824f4e2a24c1c1d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WindowFeatures(ptr: Pointer?): WithDefault =
        ICoreWebView2WindowFeatures_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2WindowFeatures {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WindowFeatures(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WindowFeatures): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__365338228_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WindowFeatures):
        Array<ICoreWebView2WindowFeatures?> = (elements as
        Array<ICoreWebView2WindowFeatures?>).castToImpl<ICoreWebView2WindowFeatures,ICoreWebView2WindowFeatures_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WindowFeatures?> =
        arrayOfNulls<ICoreWebView2WindowFeatures_Impl>(size) as Array<ICoreWebView2WindowFeatures?>
  }
}
