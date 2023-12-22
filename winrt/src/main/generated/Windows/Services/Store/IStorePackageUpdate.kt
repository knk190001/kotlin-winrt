package Windows.Services.Store

import Windows.ApplicationModel.Package
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorePackageUpdate.ABI::class)
@Signature("{140fa150-3cbf-4a35-b91f-48271c31b072}")
@Guid("140fa1503cbf4a35b91f48271c31b072")
@WinRTInterface("140fa1503cbf4a35b91f48271c31b072")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePackageUpdate.ByReference::class)
public interface IStorePackageUpdate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Package(): Package?

  @InterfaceMethod(1)
  public fun get_Mandatory(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePackageUpdate> {
    public override fun getValue() = ABI.makeIStorePackageUpdate(pointer.getPointer(0))

    public fun setValue(value: IStorePackageUpdate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePackageUpdate {
    public val __656741819_Ptr: Pointer?

    public val _656741819_VtblPtr: Pointer?
      get() = __656741819_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Package(): Package? {
      val fnPtr = _656741819_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__656741819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Mandatory(): Boolean {
      val fnPtr = _656741819_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__656741819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorePackageUpdate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __656741819_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePackageUpdate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("140fa1503cbf4a35b91f48271c31b072")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePackageUpdate(ptr: Pointer?): WithDefault = IStorePackageUpdate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePackageUpdate {
      val address = segment.toRawLongValue()
      return makeIStorePackageUpdate(Pointer(address))
    }

    public override fun toNative(obj: IStorePackageUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__656741819_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePackageUpdate): Array<IStorePackageUpdate?> =
        (elements as
        Array<IStorePackageUpdate?>).castToImpl<IStorePackageUpdate,IStorePackageUpdate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePackageUpdate?> =
        arrayOfNulls<IStorePackageUpdate_Impl>(size) as Array<IStorePackageUpdate?>
  }
}
