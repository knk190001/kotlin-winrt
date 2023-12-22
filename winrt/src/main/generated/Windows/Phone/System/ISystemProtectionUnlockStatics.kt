package Windows.Phone.System

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

@ABIMarker(ISystemProtectionUnlockStatics.ABI::class)
@Signature("{0692fa3f-8f11-4c4b-aa0d-87d7af7b1779}")
@Guid("0692fa3f8f114c4baa0d87d7af7b1779")
@WinRTInterface("0692fa3f8f114c4baa0d87d7af7b1779")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemProtectionUnlockStatics.ByReference::class)
public interface ISystemProtectionUnlockStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestScreenUnlock(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemProtectionUnlockStatics> {
    public override fun getValue() = ABI.makeISystemProtectionUnlockStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemProtectionUnlockStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemProtectionUnlockStatics {
    public val __966777430_Ptr: Pointer?

    public val _966777430_VtblPtr: Pointer?
      get() = __966777430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestScreenUnlock(): Unit {
      val fnPtr = _966777430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__966777430_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemProtectionUnlockStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __966777430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemProtectionUnlockStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0692fa3f8f114c4baa0d87d7af7b1779")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemProtectionUnlockStatics(ptr: Pointer?): WithDefault =
        ISystemProtectionUnlockStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemProtectionUnlockStatics {
      val address = segment.toRawLongValue()
      return makeISystemProtectionUnlockStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemProtectionUnlockStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__966777430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemProtectionUnlockStatics):
        Array<ISystemProtectionUnlockStatics?> = (elements as
        Array<ISystemProtectionUnlockStatics?>).castToImpl<ISystemProtectionUnlockStatics,ISystemProtectionUnlockStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemProtectionUnlockStatics?> =
        arrayOfNulls<ISystemProtectionUnlockStatics_Impl>(size) as
        Array<ISystemProtectionUnlockStatics?>
  }
}
