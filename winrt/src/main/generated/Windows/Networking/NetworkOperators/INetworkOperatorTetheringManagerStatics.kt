package Windows.Networking.NetworkOperators

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorTetheringManagerStatics.ABI::class)
@Signature("{3ebcbacc-f8c3-405c-9964-70a1eeabe194}")
@Guid("3ebcbaccf8c3405c996470a1eeabe194")
@WinRTInterface("3ebcbaccf8c3405c996470a1eeabe194")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringManagerStatics.ByReference::class)
public interface INetworkOperatorTetheringManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTetheringCapability(networkAccountId: String?): TetheringCapability?

  @InterfaceMethod(1)
  public fun CreateFromNetworkAccountId(networkAccountId: String?): NetworkOperatorTetheringManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringManagerStatics> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringManagerStatics(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringManagerStatics {
    public val __138040303_Ptr: Pointer?

    public val _138040303_VtblPtr: Pointer?
      get() = __138040303_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTetheringCapability(networkAccountId: String?): TetheringCapability? {
      val fnPtr = _138040303_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TetheringCapability>()
      val hr = fn.invokeHR(arrayOf(__138040303_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TetheringCapability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNetworkAccountId(networkAccountId: String?):
        NetworkOperatorTetheringManager? {
      val fnPtr = _138040303_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorTetheringManager>()
      val hr = fn.invokeHR(arrayOf(__138040303_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkOperatorTetheringManager>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __138040303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ebcbaccf8c3405c996470a1eeabe194")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringManagerStatics(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringManagerStatics {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__138040303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringManagerStatics):
        Array<INetworkOperatorTetheringManagerStatics?> = (elements as
        Array<INetworkOperatorTetheringManagerStatics?>).castToImpl<INetworkOperatorTetheringManagerStatics,INetworkOperatorTetheringManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringManagerStatics?> =
        arrayOfNulls<INetworkOperatorTetheringManagerStatics_Impl>(size) as
        Array<INetworkOperatorTetheringManagerStatics?>
  }
}
