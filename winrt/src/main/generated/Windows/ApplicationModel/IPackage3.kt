package Windows.ApplicationModel

import Windows.ApplicationModel.Core.AppListEntry
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPackage3.ABI::class)
@Signature("{5f738b61-f86a-4917-93d1-f1ee9d3b35d9}")
@Guid("5f738b61f86a491793d1f1ee9d3b35d9")
@WinRTInterface("5f738b61f86a491793d1f1ee9d3b35d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackage3.ByReference::class)
public interface IPackage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PackageStatus?

  @InterfaceMethod(1)
  public fun get_InstalledDate(): DateTime?

  @InterfaceMethod(2)
  public fun GetAppListEntriesAsync(): IAsyncOperation<IVectorView<AppListEntry?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackage3> {
    public override fun getValue() = ABI.makeIPackage3(pointer.getPointer(0))

    public fun setValue(value: IPackage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackage3 {
    public val __1252479854_Ptr: Pointer?

    public val _1252479854_VtblPtr: Pointer?
      get() = __1252479854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PackageStatus? {
      val fnPtr = _1252479854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageStatus>()
      val hr = fn.invokeHR(arrayOf(__1252479854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InstalledDate(): DateTime? {
      val fnPtr = _1252479854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1252479854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAppListEntriesAsync(): IAsyncOperation<IVectorView<AppListEntry?>?>? {
      val fnPtr = _1252479854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppListEntry?>?>>()
      val hr = fn.invokeHR(arrayOf(__1252479854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppListEntry?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252479854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f738b61f86a491793d1f1ee9d3b35d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackage3(ptr: Pointer?): WithDefault = IPackage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackage3 {
      val address = segment.toRawLongValue()
      return makeIPackage3(Pointer(address))
    }

    public override fun toNative(obj: IPackage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252479854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage3): Array<IPackage3?> = (elements as
        Array<IPackage3?>).castToImpl<IPackage3,IPackage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage3?> = arrayOfNulls<IPackage3_Impl>(size)
        as Array<IPackage3?>
  }
}
