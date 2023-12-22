package Windows.Management.Deployment

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ISharedPackageContainer.ABI::class)
@Signature("{177f1aa9-151e-5ef7-b1d9-2fba0b4b0d17}")
@Guid("177f1aa9151e5ef7b1d92fba0b4b0d17")
@WinRTInterface("177f1aa9151e5ef7b1d92fba0b4b0d17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedPackageContainer.ByReference::class)
public interface ISharedPackageContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun GetMembers(): IVector<SharedPackageContainerMember?>?

  @InterfaceMethod(3)
  public fun RemovePackageFamily(packageFamilyName: String?,
      options: UpdateSharedPackageContainerOptions?): UpdateSharedPackageContainerResult?

  @InterfaceMethod(4)
  public fun ResetData(): UpdateSharedPackageContainerResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedPackageContainer> {
    public override fun getValue() = ABI.makeISharedPackageContainer(pointer.getPointer(0))

    public fun setValue(value: ISharedPackageContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedPackageContainer {
    public val __1510507676_Ptr: Pointer?

    public val _1510507676_VtblPtr: Pointer?
      get() = __1510507676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1510507676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1510507676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _1510507676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1510507676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetMembers(): IVector<SharedPackageContainerMember?>? {
      val fnPtr = _1510507676_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SharedPackageContainerMember?>>()
      val hr = fn.invokeHR(arrayOf(__1510507676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SharedPackageContainerMember?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RemovePackageFamily(packageFamilyName: String?,
        options: UpdateSharedPackageContainerOptions?): UpdateSharedPackageContainerResult? {
      val fnPtr = _1510507676_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UpdateSharedPackageContainerResult>()
      val hr = fn.invokeHR(arrayOf(__1510507676_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UpdateSharedPackageContainerResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ResetData(): UpdateSharedPackageContainerResult? {
      val fnPtr = _1510507676_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UpdateSharedPackageContainerResult>()
      val hr = fn.invokeHR(arrayOf(__1510507676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UpdateSharedPackageContainerResult>(result.getValue())
      return resultValue
    }
  }

  public class ISharedPackageContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1510507676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedPackageContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("177f1aa9151e5ef7b1d92fba0b4b0d17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedPackageContainer(ptr: Pointer?): WithDefault =
        ISharedPackageContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedPackageContainer {
      val address = segment.toRawLongValue()
      return makeISharedPackageContainer(Pointer(address))
    }

    public override fun toNative(obj: ISharedPackageContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1510507676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedPackageContainer): Array<ISharedPackageContainer?>
        = (elements as
        Array<ISharedPackageContainer?>).castToImpl<ISharedPackageContainer,ISharedPackageContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedPackageContainer?> =
        arrayOfNulls<ISharedPackageContainer_Impl>(size) as Array<ISharedPackageContainer?>
  }
}
