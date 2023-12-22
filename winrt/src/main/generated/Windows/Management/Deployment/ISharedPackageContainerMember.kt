package Windows.Management.Deployment

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

@ABIMarker(ISharedPackageContainerMember.ABI::class)
@Signature("{fe0d0438-43c9-5426-b89c-f79bf85ddff4}")
@Guid("fe0d043843c95426b89cf79bf85ddff4")
@WinRTInterface("fe0d043843c95426b89cf79bf85ddff4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedPackageContainerMember.ByReference::class)
public interface ISharedPackageContainerMember : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackageFamilyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedPackageContainerMember> {
    public override fun getValue() = ABI.makeISharedPackageContainerMember(pointer.getPointer(0))

    public fun setValue(value: ISharedPackageContainerMember_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedPackageContainerMember {
    public val __498739426_Ptr: Pointer?

    public val _498739426_VtblPtr: Pointer?
      get() = __498739426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _498739426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__498739426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISharedPackageContainerMember_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __498739426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedPackageContainerMember, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe0d043843c95426b89cf79bf85ddff4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedPackageContainerMember(ptr: Pointer?): WithDefault =
        ISharedPackageContainerMember_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedPackageContainerMember {
      val address = segment.toRawLongValue()
      return makeISharedPackageContainerMember(Pointer(address))
    }

    public override fun toNative(obj: ISharedPackageContainerMember): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__498739426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedPackageContainerMember):
        Array<ISharedPackageContainerMember?> = (elements as
        Array<ISharedPackageContainerMember?>).castToImpl<ISharedPackageContainerMember,ISharedPackageContainerMember_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedPackageContainerMember?> =
        arrayOfNulls<ISharedPackageContainerMember_Impl>(size) as
        Array<ISharedPackageContainerMember?>
  }
}
