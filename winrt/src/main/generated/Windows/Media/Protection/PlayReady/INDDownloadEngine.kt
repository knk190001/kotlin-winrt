package Windows.Media.Protection.PlayReady

import Windows.Foundation.TimeSpan
import Windows.Foundation.Uri
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDDownloadEngine.ABI::class)
@Signature("{2d223d65-c4b6-4438-8d46-b96e6d0fb21f}")
@Guid("2d223d65c4b644388d46b96e6d0fb21f")
@WinRTInterface("2d223d65c4b644388d46b96e6d0fb21f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDDownloadEngine.ByReference::class)
public interface INDDownloadEngine : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Open(uri: Uri?, sessionIDBytes: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun Pause(): Unit

  @InterfaceMethod(2)
  public fun Resume(): Unit

  @InterfaceMethod(3)
  public fun Close(): Unit

  @InterfaceMethod(4)
  public fun Seek(startPosition: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_CanSeek(): Boolean

  @InterfaceMethod(6)
  public fun get_BufferFullMinThresholdInSamples(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_BufferFullMaxThresholdInSamples(): WinDef.UINT

  @InterfaceMethod(8)
  public fun get_Notifier(): NDDownloadEngineNotifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDDownloadEngine> {
    public override fun getValue() = ABI.makeINDDownloadEngine(pointer.getPointer(0))

    public fun setValue(value: INDDownloadEngine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDDownloadEngine {
    public val __1626040806_Ptr: Pointer?

    public val _1626040806_VtblPtr: Pointer?
      get() = __1626040806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Open(uri: Uri?, sessionIDBytes: Array<Byte>): Unit {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr, marshalToNative(uri),
          sessionIDBytes.size,marshalToNative(sessionIDBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Pause(): Unit {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Resume(): Unit {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Close(): Unit {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Seek(startPosition: TimeSpan?): Unit {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr, marshalToNative(startPosition),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CanSeek(): Boolean {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_BufferFullMinThresholdInSamples(): WinDef.UINT {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_BufferFullMaxThresholdInSamples(): WinDef.UINT {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Notifier(): NDDownloadEngineNotifier? {
      val fnPtr = _1626040806_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDDownloadEngineNotifier>()
      val hr = fn.invokeHR(arrayOf(__1626040806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDDownloadEngineNotifier>(result.getValue())
      return resultValue
    }
  }

  public class INDDownloadEngine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1626040806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDDownloadEngine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d223d65c4b644388d46b96e6d0fb21f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDDownloadEngine(ptr: Pointer?): WithDefault = INDDownloadEngine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDDownloadEngine {
      val address = segment.toRawLongValue()
      return makeINDDownloadEngine(Pointer(address))
    }

    public override fun toNative(obj: INDDownloadEngine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1626040806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDDownloadEngine): Array<INDDownloadEngine?> = (elements
        as Array<INDDownloadEngine?>).castToImpl<INDDownloadEngine,INDDownloadEngine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDDownloadEngine?> =
        arrayOfNulls<INDDownloadEngine_Impl>(size) as Array<INDDownloadEngine?>
  }
}
