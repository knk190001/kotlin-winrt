package Windows.Management.Policies

import Windows.System.User
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

@ABIMarker(INamedPolicyStatics.ABI::class)
@Signature("{7f793be7-76c4-4058-8cad-67662cd05f0d}")
@Guid("7f793be776c440588cad67662cd05f0d")
@WinRTInterface("7f793be776c440588cad67662cd05f0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INamedPolicyStatics.ByReference::class)
public interface INamedPolicyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPolicyFromPath(area: String?, name: String?): NamedPolicyData?

  @InterfaceMethod(1)
  public fun GetPolicyFromPathForUser(
    user: User?,
    area: String?,
    name: String?
  ): NamedPolicyData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INamedPolicyStatics> {
    public override fun getValue() = ABI.makeINamedPolicyStatics(pointer.getPointer(0))

    public fun setValue(value: INamedPolicyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INamedPolicyStatics {
    public val __811810029_Ptr: Pointer?

    public val _811810029_VtblPtr: Pointer?
      get() = __811810029_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPolicyFromPath(area: String?, name: String?): NamedPolicyData? {
      val fnPtr = _811810029_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NamedPolicyData>()
      val hr = fn.invokeHR(arrayOf(__811810029_Ptr, marshalToNative(area), marshalToNative(name),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NamedPolicyData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPolicyFromPathForUser(
      user: User?,
      area: String?,
      name: String?
    ): NamedPolicyData? {
      val fnPtr = _811810029_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NamedPolicyData>()
      val hr = fn.invokeHR(arrayOf(__811810029_Ptr, marshalToNative(user), marshalToNative(area),
          marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NamedPolicyData>(result.getValue())
      return resultValue
    }
  }

  public class INamedPolicyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __811810029_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INamedPolicyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f793be776c440588cad67662cd05f0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINamedPolicyStatics(ptr: Pointer?): WithDefault = INamedPolicyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INamedPolicyStatics {
      val address = segment.toRawLongValue()
      return makeINamedPolicyStatics(Pointer(address))
    }

    public override fun toNative(obj: INamedPolicyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__811810029_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INamedPolicyStatics): Array<INamedPolicyStatics?> =
        (elements as
        Array<INamedPolicyStatics?>).castToImpl<INamedPolicyStatics,INamedPolicyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INamedPolicyStatics?> =
        arrayOfNulls<INamedPolicyStatics_Impl>(size) as Array<INamedPolicyStatics?>
  }
}
