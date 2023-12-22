package Windows.ApplicationModel

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

@ABIMarker(IPackageContentGroupStatics.ABI::class)
@Signature("{70ee7619-5f12-4b92-b9ea-6ccada13bc75}")
@Guid("70ee76195f124b92b9ea6ccada13bc75")
@WinRTInterface("70ee76195f124b92b9ea6ccada13bc75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageContentGroupStatics.ByReference::class)
public interface IPackageContentGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequiredGroupName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageContentGroupStatics> {
    public override fun getValue() = ABI.makeIPackageContentGroupStatics(pointer.getPointer(0))

    public fun setValue(value: IPackageContentGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageContentGroupStatics {
    public val __514950690_Ptr: Pointer?

    public val _514950690_VtblPtr: Pointer?
      get() = __514950690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequiredGroupName(): String? {
      val fnPtr = _514950690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__514950690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPackageContentGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __514950690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageContentGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70ee76195f124b92b9ea6ccada13bc75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageContentGroupStatics(ptr: Pointer?): WithDefault =
        IPackageContentGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageContentGroupStatics {
      val address = segment.toRawLongValue()
      return makeIPackageContentGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: IPackageContentGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__514950690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageContentGroupStatics):
        Array<IPackageContentGroupStatics?> = (elements as
        Array<IPackageContentGroupStatics?>).castToImpl<IPackageContentGroupStatics,IPackageContentGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageContentGroupStatics?> =
        arrayOfNulls<IPackageContentGroupStatics_Impl>(size) as Array<IPackageContentGroupStatics?>
  }
}
