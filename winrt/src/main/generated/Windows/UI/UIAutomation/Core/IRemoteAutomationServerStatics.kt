package Windows.UI.UIAutomation.Core

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

@ABIMarker(IRemoteAutomationServerStatics.ABI::class)
@Signature("{e6e8945e-0c11-5028-9ae3-c2771288b6b7}")
@Guid("e6e8945e0c1150289ae3c2771288b6b7")
@WinRTInterface("e6e8945e0c1150289ae3c2771288b6b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationServerStatics.ByReference::class)
public interface IRemoteAutomationServerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportSession(sessionId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationServerStatics> {
    public override fun getValue() = ABI.makeIRemoteAutomationServerStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationServerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationServerStatics {
    public val __1350568911_Ptr: Pointer?

    public val _1350568911_VtblPtr: Pointer?
      get() = __1350568911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportSession(sessionId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1350568911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350568911_Ptr, marshalToNative(sessionId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteAutomationServerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350568911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationServerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6e8945e0c1150289ae3c2771288b6b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationServerStatics(ptr: Pointer?): WithDefault =
        IRemoteAutomationServerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteAutomationServerStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationServerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationServerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350568911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationServerStatics):
        Array<IRemoteAutomationServerStatics?> = (elements as
        Array<IRemoteAutomationServerStatics?>).castToImpl<IRemoteAutomationServerStatics,IRemoteAutomationServerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationServerStatics?> =
        arrayOfNulls<IRemoteAutomationServerStatics_Impl>(size) as
        Array<IRemoteAutomationServerStatics?>
  }
}
