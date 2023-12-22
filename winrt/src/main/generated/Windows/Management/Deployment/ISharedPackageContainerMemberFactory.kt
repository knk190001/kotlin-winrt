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

@ABIMarker(ISharedPackageContainerMemberFactory.ABI::class)
@Signature("{49b0ceeb-498f-5a62-b738-b3ca0d436704}")
@Guid("49b0ceeb498f5a62b738b3ca0d436704")
@WinRTInterface("49b0ceeb498f5a62b738b3ca0d436704")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedPackageContainerMemberFactory.ByReference::class)
public interface ISharedPackageContainerMemberFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(packageFamilyName: String?): SharedPackageContainerMember?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedPackageContainerMemberFactory> {
    public override fun getValue() =
        ABI.makeISharedPackageContainerMemberFactory(pointer.getPointer(0))

    public fun setValue(value: ISharedPackageContainerMemberFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedPackageContainerMemberFactory {
    public val __1632719884_Ptr: Pointer?

    public val _1632719884_VtblPtr: Pointer?
      get() = __1632719884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(packageFamilyName: String?): SharedPackageContainerMember? {
      val fnPtr = _1632719884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerMember>()
      val hr = fn.invokeHR(arrayOf(__1632719884_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerMember>(result.getValue())
      return resultValue
    }
  }

  public class ISharedPackageContainerMemberFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632719884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedPackageContainerMemberFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49b0ceeb498f5a62b738b3ca0d436704")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedPackageContainerMemberFactory(ptr: Pointer?): WithDefault =
        ISharedPackageContainerMemberFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedPackageContainerMemberFactory {
      val address = segment.toRawLongValue()
      return makeISharedPackageContainerMemberFactory(Pointer(address))
    }

    public override fun toNative(obj: ISharedPackageContainerMemberFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632719884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedPackageContainerMemberFactory):
        Array<ISharedPackageContainerMemberFactory?> = (elements as
        Array<ISharedPackageContainerMemberFactory?>).castToImpl<ISharedPackageContainerMemberFactory,ISharedPackageContainerMemberFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedPackageContainerMemberFactory?> =
        arrayOfNulls<ISharedPackageContainerMemberFactory_Impl>(size) as
        Array<ISharedPackageContainerMemberFactory?>
  }
}
