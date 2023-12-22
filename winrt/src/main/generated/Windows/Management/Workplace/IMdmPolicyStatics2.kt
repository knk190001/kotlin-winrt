package Windows.Management.Workplace

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

@ABIMarker(IMdmPolicyStatics2.ABI::class)
@Signature("{c99c7526-03d4-49f9-a993-43efccd265c4}")
@Guid("c99c752603d449f9a99343efccd265c4")
@WinRTInterface("c99c752603d449f9a99343efccd265c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMdmPolicyStatics2.ByReference::class)
public interface IMdmPolicyStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetMessagingSyncPolicy(): MessagingSyncPolicy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMdmPolicyStatics2> {
    public override fun getValue() = ABI.makeIMdmPolicyStatics2(pointer.getPointer(0))

    public fun setValue(value: IMdmPolicyStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMdmPolicyStatics2 {
    public val __177719362_Ptr: Pointer?

    public val _177719362_VtblPtr: Pointer?
      get() = __177719362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMessagingSyncPolicy(): MessagingSyncPolicy? {
      val fnPtr = _177719362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessagingSyncPolicy>()
      val hr = fn.invokeHR(arrayOf(__177719362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessagingSyncPolicy>(result.getValue())
      return resultValue
    }
  }

  public class IMdmPolicyStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177719362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMdmPolicyStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c99c752603d449f9a99343efccd265c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMdmPolicyStatics2(ptr: Pointer?): WithDefault = IMdmPolicyStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMdmPolicyStatics2 {
      val address = segment.toRawLongValue()
      return makeIMdmPolicyStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMdmPolicyStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177719362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMdmPolicyStatics2): Array<IMdmPolicyStatics2?> =
        (elements as
        Array<IMdmPolicyStatics2?>).castToImpl<IMdmPolicyStatics2,IMdmPolicyStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMdmPolicyStatics2?> =
        arrayOfNulls<IMdmPolicyStatics2_Impl>(size) as Array<IMdmPolicyStatics2?>
  }
}
