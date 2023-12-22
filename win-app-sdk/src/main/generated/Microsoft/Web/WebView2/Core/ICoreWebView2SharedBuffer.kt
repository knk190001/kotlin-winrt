package Microsoft.Web.WebView2.Core

import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2SharedBuffer.ABI::class)
@Signature("{2907cc84-f843-5959-8734-f871766f8f13}")
@Guid("2907cc84f84359598734f871766f8f13")
@WinRTInterface("2907cc84f84359598734f871766f8f13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2SharedBuffer.ByReference::class)
public interface ICoreWebView2SharedBuffer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Size(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun OpenStream(): IRandomAccessStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2SharedBuffer> {
    public override fun getValue() = ABI.makeICoreWebView2SharedBuffer(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2SharedBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2SharedBuffer {
    public val __1311921388_Ptr: Pointer?

    public val _1311921388_VtblPtr: Pointer?
      get() = __1311921388_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): WinDef.ULONG {
      val fnPtr = _1311921388_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1311921388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun OpenStream(): IRandomAccessStream? {
      val fnPtr = _1311921388_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1311921388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2SharedBuffer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1311921388_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2SharedBuffer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2907cc84f84359598734f871766f8f13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2SharedBuffer(ptr: Pointer?): WithDefault =
        ICoreWebView2SharedBuffer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2SharedBuffer {
      val address = segment.toRawLongValue()
      return makeICoreWebView2SharedBuffer(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2SharedBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1311921388_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2SharedBuffer):
        Array<ICoreWebView2SharedBuffer?> = (elements as
        Array<ICoreWebView2SharedBuffer?>).castToImpl<ICoreWebView2SharedBuffer,ICoreWebView2SharedBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2SharedBuffer?> =
        arrayOfNulls<ICoreWebView2SharedBuffer_Impl>(size) as Array<ICoreWebView2SharedBuffer?>
  }
}
