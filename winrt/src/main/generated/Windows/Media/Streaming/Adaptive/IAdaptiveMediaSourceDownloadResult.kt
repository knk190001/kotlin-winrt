package Windows.Media.Streaming.Adaptive

import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceDownloadResult.ABI::class)
@Signature("{f4afdc73-bcee-4a6a-9f0a-fec41e2339b0}")
@Guid("f4afdc73bcee4a6a9f0afec41e2339b0")
@WinRTInterface("f4afdc73bcee4a6a9f0afec41e2339b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadResult.ByReference::class)
public interface IAdaptiveMediaSourceDownloadResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceUri(): Uri?

  @InterfaceMethod(1)
  public fun put_ResourceUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_InputStream(): IInputStream?

  @InterfaceMethod(3)
  public fun put_InputStream(value: IInputStream?): Unit

  @InterfaceMethod(4)
  public fun get_Buffer(): IBuffer?

  @InterfaceMethod(5)
  public fun put_Buffer(value: IBuffer?): Unit

  @InterfaceMethod(6)
  public fun get_ContentType(): String?

  @InterfaceMethod(7)
  public fun put_ContentType(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_ExtendedStatus(): WinDef.UINT

  @InterfaceMethod(9)
  public fun put_ExtendedStatus(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadResult> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadResult(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadResult {
    public val __830262588_Ptr: Pointer?

    public val _830262588_VtblPtr: Pointer?
      get() = __830262588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceUri(): Uri? {
      val fnPtr = _830262588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ResourceUri(value: Uri?): Unit {
      val fnPtr = _830262588_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _830262588_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InputStream(value: IInputStream?): Unit {
      val fnPtr = _830262588_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Buffer(): IBuffer? {
      val fnPtr = _830262588_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Buffer(value: IBuffer?): Unit {
      val fnPtr = _830262588_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentType(): String? {
      val fnPtr = _830262588_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentType(value: String?): Unit {
      val fnPtr = _830262588_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ExtendedStatus(): WinDef.UINT {
      val fnPtr = _830262588_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ExtendedStatus(value: WinDef.UINT): Unit {
      val fnPtr = _830262588_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830262588_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveMediaSourceDownloadResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __830262588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4afdc73bcee4a6a9f0afec41e2339b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadResult(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceDownloadResult {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadResult(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__830262588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadResult):
        Array<IAdaptiveMediaSourceDownloadResult?> = (elements as
        Array<IAdaptiveMediaSourceDownloadResult?>).castToImpl<IAdaptiveMediaSourceDownloadResult,IAdaptiveMediaSourceDownloadResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadResult?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadResult_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadResult?>
  }
}
