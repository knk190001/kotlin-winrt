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

@ABIMarker(ICoreWebView2ContextMenuTarget.ABI::class)
@Signature("{41e24e6a-4612-5bd9-8e61-e9280615205e}")
@Guid("41e24e6a46125bd98e61e9280615205e")
@WinRTInterface("41e24e6a46125bd98e61e9280615205e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ContextMenuTarget.ByReference::class)
public interface ICoreWebView2ContextMenuTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): CoreWebView2ContextMenuTargetKind?

  @InterfaceMethod(1)
  public fun get_IsEditable(): Boolean

  @InterfaceMethod(2)
  public fun get_IsRequestedForMainFrame(): Boolean

  @InterfaceMethod(3)
  public fun get_PageUri(): String?

  @InterfaceMethod(4)
  public fun get_FrameUri(): String?

  @InterfaceMethod(5)
  public fun get_HasLinkUri(): Boolean

  @InterfaceMethod(6)
  public fun get_LinkUri(): String?

  @InterfaceMethod(7)
  public fun get_HasLinkText(): Boolean

  @InterfaceMethod(8)
  public fun get_LinkText(): String?

  @InterfaceMethod(9)
  public fun get_HasSourceUri(): Boolean

  @InterfaceMethod(10)
  public fun get_SourceUri(): String?

  @InterfaceMethod(11)
  public fun get_HasSelection(): Boolean

  @InterfaceMethod(12)
  public fun get_SelectionText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ContextMenuTarget> {
    public override fun getValue() = ABI.makeICoreWebView2ContextMenuTarget(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ContextMenuTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ContextMenuTarget {
    public val __1840169816_Ptr: Pointer?

    public val _1840169816_VtblPtr: Pointer?
      get() = __1840169816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): CoreWebView2ContextMenuTargetKind? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ContextMenuTargetKind>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ContextMenuTargetKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEditable(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsRequestedForMainFrame(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PageUri(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FrameUri(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HasLinkUri(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_LinkUri(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HasLinkText(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_LinkText(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HasSourceUri(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_SourceUri(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_HasSelection(): Boolean {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_SelectionText(): String? {
      val fnPtr = _1840169816_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840169816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ContextMenuTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1840169816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ContextMenuTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41e24e6a46125bd98e61e9280615205e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ContextMenuTarget(ptr: Pointer?): WithDefault =
        ICoreWebView2ContextMenuTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ContextMenuTarget {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ContextMenuTarget(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ContextMenuTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1840169816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ContextMenuTarget):
        Array<ICoreWebView2ContextMenuTarget?> = (elements as
        Array<ICoreWebView2ContextMenuTarget?>).castToImpl<ICoreWebView2ContextMenuTarget,ICoreWebView2ContextMenuTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ContextMenuTarget?> =
        arrayOfNulls<ICoreWebView2ContextMenuTarget_Impl>(size) as
        Array<ICoreWebView2ContextMenuTarget?>
  }
}
