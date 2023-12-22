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

@ABIMarker(INDClientFactory.ABI::class)
@Signature("{3e53dd62-fee8-451f-b0d4-f706cca3e037}")
@Guid("3e53dd62fee8451fb0d4f706cca3e037")
@WinRTInterface("3e53dd62fee8451fb0d4f706cca3e037")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDClientFactory.ByReference::class)
public interface INDClientFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    downloadEngine: INDDownloadEngine?,
    streamParser: INDStreamParser?,
    pMessenger: INDMessenger?
  ): NDClient?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDClientFactory> {
    public override fun getValue() = ABI.makeINDClientFactory(pointer.getPointer(0))

    public fun setValue(value: INDClientFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDClientFactory {
    public val __1285933169_Ptr: Pointer?

    public val _1285933169_VtblPtr: Pointer?
      get() = __1285933169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      downloadEngine: INDDownloadEngine?,
      streamParser: INDStreamParser?,
      pMessenger: INDMessenger?
    ): NDClient? {
      val fnPtr = _1285933169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDClient>()
      val hr = fn.invokeHR(arrayOf(__1285933169_Ptr, marshalToNative(downloadEngine),
          marshalToNative(streamParser), marshalToNative(pMessenger), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDClient>(result.getValue())
      return resultValue
    }
  }

  public class INDClientFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1285933169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDClientFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e53dd62fee8451fb0d4f706cca3e037")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDClientFactory(ptr: Pointer?): WithDefault = INDClientFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDClientFactory {
      val address = segment.toRawLongValue()
      return makeINDClientFactory(Pointer(address))
    }

    public override fun toNative(obj: INDClientFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1285933169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDClientFactory): Array<INDClientFactory?> = (elements as
        Array<INDClientFactory?>).castToImpl<INDClientFactory,INDClientFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDClientFactory?> =
        arrayOfNulls<INDClientFactory_Impl>(size) as Array<INDClientFactory?>
  }
}
