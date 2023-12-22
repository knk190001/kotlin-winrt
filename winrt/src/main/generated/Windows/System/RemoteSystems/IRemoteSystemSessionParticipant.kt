package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.HostName
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

@ABIMarker(IRemoteSystemSessionParticipant.ABI::class)
@Signature("{7e90058c-acf9-4729-8a17-44e7baed5dcc}")
@Guid("7e90058cacf947298a1744e7baed5dcc")
@WinRTInterface("7e90058cacf947298a1744e7baed5dcc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionParticipant.ByReference::class)
public interface IRemoteSystemSessionParticipant : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystem(): RemoteSystem?

  @InterfaceMethod(1)
  public fun GetHostNames(): IVectorView<HostName?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionParticipant> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionParticipant(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionParticipant_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionParticipant {
    public val __1165970673_Ptr: Pointer?

    public val _1165970673_VtblPtr: Pointer?
      get() = __1165970673_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystem(): RemoteSystem? {
      val fnPtr = _1165970673_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystem>()
      val hr = fn.invokeHR(arrayOf(__1165970673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetHostNames(): IVectorView<HostName?>? {
      val fnPtr = _1165970673_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__1165970673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HostName?>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionParticipant_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1165970673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionParticipant, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e90058cacf947298a1744e7baed5dcc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionParticipant(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionParticipant_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionParticipant {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionParticipant(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionParticipant): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1165970673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionParticipant):
        Array<IRemoteSystemSessionParticipant?> = (elements as
        Array<IRemoteSystemSessionParticipant?>).castToImpl<IRemoteSystemSessionParticipant,IRemoteSystemSessionParticipant_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionParticipant?> =
        arrayOfNulls<IRemoteSystemSessionParticipant_Impl>(size) as
        Array<IRemoteSystemSessionParticipant?>
  }
}
