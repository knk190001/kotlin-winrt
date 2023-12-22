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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDTCPMessengerFactory.ABI::class)
@Signature("{7dd85cfe-1b99-4f68-8f82-8177f7cedf2b}")
@Guid("7dd85cfe1b994f688f828177f7cedf2b")
@WinRTInterface("7dd85cfe1b994f688f828177f7cedf2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDTCPMessengerFactory.ByReference::class)
public interface INDTCPMessengerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(remoteHostName: String?, remoteHostPort: WinDef.UINT): NDTCPMessenger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDTCPMessengerFactory> {
    public override fun getValue() = ABI.makeINDTCPMessengerFactory(pointer.getPointer(0))

    public fun setValue(value: INDTCPMessengerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDTCPMessengerFactory {
    public val __942116536_Ptr: Pointer?

    public val _942116536_VtblPtr: Pointer?
      get() = __942116536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(remoteHostName: String?, remoteHostPort: WinDef.UINT):
        NDTCPMessenger? {
      val fnPtr = _942116536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDTCPMessenger>()
      val hr = fn.invokeHR(arrayOf(__942116536_Ptr, marshalToNative(remoteHostName), remoteHostPort,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDTCPMessenger>(result.getValue())
      return resultValue
    }
  }

  public class INDTCPMessengerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942116536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDTCPMessengerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7dd85cfe1b994f688f828177f7cedf2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDTCPMessengerFactory(ptr: Pointer?): WithDefault =
        INDTCPMessengerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDTCPMessengerFactory {
      val address = segment.toRawLongValue()
      return makeINDTCPMessengerFactory(Pointer(address))
    }

    public override fun toNative(obj: INDTCPMessengerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942116536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDTCPMessengerFactory): Array<INDTCPMessengerFactory?> =
        (elements as
        Array<INDTCPMessengerFactory?>).castToImpl<INDTCPMessengerFactory,INDTCPMessengerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDTCPMessengerFactory?> =
        arrayOfNulls<INDTCPMessengerFactory_Impl>(size) as Array<INDTCPMessengerFactory?>
  }
}
