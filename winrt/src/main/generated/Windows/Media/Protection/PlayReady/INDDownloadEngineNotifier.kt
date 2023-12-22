package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDDownloadEngineNotifier.ABI::class)
@Signature("{d720b4d4-f4b8-4530-a809-9193a571e7fc}")
@Guid("d720b4d4f4b84530a8099193a571e7fc")
@WinRTInterface("d720b4d4f4b84530a8099193a571e7fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDDownloadEngineNotifier.ByReference::class)
public interface INDDownloadEngineNotifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnStreamOpened(): Unit

  @InterfaceMethod(1)
  public fun OnPlayReadyObjectReceived(dataBytes: Array<Byte>): Unit

  @InterfaceMethod(2)
  public fun OnContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor?): Unit

  @InterfaceMethod(3)
  public fun OnDataReceived(dataBytes: Array<Byte>, bytesReceived: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun OnEndOfStream(): Unit

  @InterfaceMethod(5)
  public fun OnNetworkError(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDDownloadEngineNotifier> {
    public override fun getValue() = ABI.makeINDDownloadEngineNotifier(pointer.getPointer(0))

    public fun setValue(value: INDDownloadEngineNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDDownloadEngineNotifier {
    public val __714409504_Ptr: Pointer?

    public val _714409504_VtblPtr: Pointer?
      get() = __714409504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnStreamOpened(): Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnPlayReadyObjectReceived(dataBytes: Array<Byte>): Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, dataBytes.size,marshalToNative(dataBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor?):
        Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, marshalToNative(licenseFetchDescriptor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnDataReceived(dataBytes: Array<Byte>, bytesReceived: WinDef.UINT): Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, dataBytes.size,marshalToNative(dataBytes),
          bytesReceived,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OnEndOfStream(): Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnNetworkError(): Unit {
      val fnPtr = _714409504_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714409504_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INDDownloadEngineNotifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __714409504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDDownloadEngineNotifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d720b4d4f4b84530a8099193a571e7fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDDownloadEngineNotifier(ptr: Pointer?): WithDefault =
        INDDownloadEngineNotifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDDownloadEngineNotifier {
      val address = segment.toRawLongValue()
      return makeINDDownloadEngineNotifier(Pointer(address))
    }

    public override fun toNative(obj: INDDownloadEngineNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714409504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDDownloadEngineNotifier):
        Array<INDDownloadEngineNotifier?> = (elements as
        Array<INDDownloadEngineNotifier?>).castToImpl<INDDownloadEngineNotifier,INDDownloadEngineNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDDownloadEngineNotifier?> =
        arrayOfNulls<INDDownloadEngineNotifier_Impl>(size) as Array<INDDownloadEngineNotifier?>
  }
}
