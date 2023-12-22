package Windows.Services.Store

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IStorePackageUpdateResult2.ABI::class)
@Signature("{071d012e-bc62-4f2e-87ea-99d801aeaf98}")
@Guid("071d012ebc624f2e87ea99d801aeaf98")
@WinRTInterface("071d012ebc624f2e87ea99d801aeaf98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePackageUpdateResult2.ByReference::class)
public interface IStorePackageUpdateResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StoreQueueItems(): IVectorView<StoreQueueItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePackageUpdateResult2> {
    public override fun getValue() = ABI.makeIStorePackageUpdateResult2(pointer.getPointer(0))

    public fun setValue(value: IStorePackageUpdateResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePackageUpdateResult2 {
    public val __1946740090_Ptr: Pointer?

    public val _1946740090_VtblPtr: Pointer?
      get() = __1946740090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StoreQueueItems(): IVectorView<StoreQueueItem?>? {
      val fnPtr = _1946740090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreQueueItem?>>()
      val hr = fn.invokeHR(arrayOf(__1946740090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreQueueItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorePackageUpdateResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946740090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePackageUpdateResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("071d012ebc624f2e87ea99d801aeaf98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePackageUpdateResult2(ptr: Pointer?): WithDefault =
        IStorePackageUpdateResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePackageUpdateResult2 {
      val address = segment.toRawLongValue()
      return makeIStorePackageUpdateResult2(Pointer(address))
    }

    public override fun toNative(obj: IStorePackageUpdateResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946740090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePackageUpdateResult2):
        Array<IStorePackageUpdateResult2?> = (elements as
        Array<IStorePackageUpdateResult2?>).castToImpl<IStorePackageUpdateResult2,IStorePackageUpdateResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePackageUpdateResult2?> =
        arrayOfNulls<IStorePackageUpdateResult2_Impl>(size) as Array<IStorePackageUpdateResult2?>
  }
}
