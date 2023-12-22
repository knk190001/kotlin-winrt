package Windows.Security.Isolation

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IIsolatedWindowsHostMessengerStatics.ABI::class)
@Signature("{06e444bb-53c0-4889-8fa3-53592e37cf21}")
@Guid("06e444bb53c048898fa353592e37cf21")
@WinRTInterface("06e444bb53c048898fa353592e37cf21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsHostMessengerStatics.ByReference::class)
public interface IIsolatedWindowsHostMessengerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PostMessageToReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
      message: IVectorView<IUnknown?>?): Unit

  @InterfaceMethod(1)
  public fun GetFileId(filePath: String?): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsHostMessengerStatics> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsHostMessengerStatics(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsHostMessengerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsHostMessengerStatics {
    public val __1100693958_Ptr: Pointer?

    public val _1100693958_VtblPtr: Pointer?
      get() = __1100693958_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PostMessageToReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
        message: IVectorView<IUnknown?>?): Unit {
      val fnPtr = _1100693958_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100693958_Ptr, marshalToNative(receiverId),
          marshalToNative(message),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetFileId(filePath: String?): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1100693958_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1100693958_Ptr, marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsHostMessengerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1100693958_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsHostMessengerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06e444bb53c048898fa353592e37cf21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsHostMessengerStatics(ptr: Pointer?): WithDefault =
        IIsolatedWindowsHostMessengerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsHostMessengerStatics {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsHostMessengerStatics(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsHostMessengerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1100693958_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsHostMessengerStatics):
        Array<IIsolatedWindowsHostMessengerStatics?> = (elements as
        Array<IIsolatedWindowsHostMessengerStatics?>).castToImpl<IIsolatedWindowsHostMessengerStatics,IIsolatedWindowsHostMessengerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsHostMessengerStatics?> =
        arrayOfNulls<IIsolatedWindowsHostMessengerStatics_Impl>(size) as
        Array<IIsolatedWindowsHostMessengerStatics?>
  }
}
