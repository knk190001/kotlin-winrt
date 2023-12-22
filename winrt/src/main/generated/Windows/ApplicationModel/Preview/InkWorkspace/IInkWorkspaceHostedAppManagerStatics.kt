package Windows.ApplicationModel.Preview.InkWorkspace

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

@ABIMarker(IInkWorkspaceHostedAppManagerStatics.ABI::class)
@Signature("{cbfd8cc5-a162-4bc4-84ee-e8716d5233c5}")
@Guid("cbfd8cc5a1624bc484eee8716d5233c5")
@WinRTInterface("cbfd8cc5a1624bc484eee8716d5233c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkWorkspaceHostedAppManagerStatics.ByReference::class)
public interface IInkWorkspaceHostedAppManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentApp(): InkWorkspaceHostedAppManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkWorkspaceHostedAppManagerStatics> {
    public override fun getValue() =
        ABI.makeIInkWorkspaceHostedAppManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IInkWorkspaceHostedAppManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkWorkspaceHostedAppManagerStatics {
    public val __1510604057_Ptr: Pointer?

    public val _1510604057_VtblPtr: Pointer?
      get() = __1510604057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentApp(): InkWorkspaceHostedAppManager? {
      val fnPtr = _1510604057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkWorkspaceHostedAppManager>()
      val hr = fn.invokeHR(arrayOf(__1510604057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkWorkspaceHostedAppManager>(result.getValue())
      return resultValue
    }
  }

  public class IInkWorkspaceHostedAppManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1510604057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkWorkspaceHostedAppManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbfd8cc5a1624bc484eee8716d5233c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkWorkspaceHostedAppManagerStatics(ptr: Pointer?): WithDefault =
        IInkWorkspaceHostedAppManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkWorkspaceHostedAppManagerStatics {
      val address = segment.toRawLongValue()
      return makeIInkWorkspaceHostedAppManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkWorkspaceHostedAppManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1510604057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkWorkspaceHostedAppManagerStatics):
        Array<IInkWorkspaceHostedAppManagerStatics?> = (elements as
        Array<IInkWorkspaceHostedAppManagerStatics?>).castToImpl<IInkWorkspaceHostedAppManagerStatics,IInkWorkspaceHostedAppManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkWorkspaceHostedAppManagerStatics?> =
        arrayOfNulls<IInkWorkspaceHostedAppManagerStatics_Impl>(size) as
        Array<IInkWorkspaceHostedAppManagerStatics?>
  }
}
