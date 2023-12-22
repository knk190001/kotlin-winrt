package Windows.Management.Core

import Windows.Storage.ApplicationData
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

@ABIMarker(IApplicationDataManagerStatics.ABI::class)
@Signature("{1e1862e3-698e-49a1-9752-dee94925b9b3}")
@Guid("1e1862e3698e49a19752dee94925b9b3")
@WinRTInterface("1e1862e3698e49a19752dee94925b9b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationDataManagerStatics.ByReference::class)
public interface IApplicationDataManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForPackageFamily(packageFamilyName: String?): ApplicationData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationDataManagerStatics> {
    public override fun getValue() = ABI.makeIApplicationDataManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationDataManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationDataManagerStatics {
    public val __1363747816_Ptr: Pointer?

    public val _1363747816_VtblPtr: Pointer?
      get() = __1363747816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForPackageFamily(packageFamilyName: String?): ApplicationData? {
      val fnPtr = _1363747816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationData>()
      val hr = fn.invokeHR(arrayOf(__1363747816_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationData>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationDataManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1363747816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationDataManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e1862e3698e49a19752dee94925b9b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationDataManagerStatics(ptr: Pointer?): WithDefault =
        IApplicationDataManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationDataManagerStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationDataManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationDataManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1363747816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationDataManagerStatics):
        Array<IApplicationDataManagerStatics?> = (elements as
        Array<IApplicationDataManagerStatics?>).castToImpl<IApplicationDataManagerStatics,IApplicationDataManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationDataManagerStatics?> =
        arrayOfNulls<IApplicationDataManagerStatics_Impl>(size) as
        Array<IApplicationDataManagerStatics?>
  }
}
