package Windows.System.Inventory

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IInstalledDesktopAppStatics.ABI::class)
@Signature("{264cf74e-21cd-5f9b-6056-7866ad72489a}")
@Guid("264cf74e21cd5f9b60567866ad72489a")
@WinRTInterface("264cf74e21cd5f9b60567866ad72489a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInstalledDesktopAppStatics.ByReference::class)
public interface IInstalledDesktopAppStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetInventoryAsync(): IAsyncOperation<IVectorView<InstalledDesktopApp?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInstalledDesktopAppStatics> {
    public override fun getValue() = ABI.makeIInstalledDesktopAppStatics(pointer.getPointer(0))

    public fun setValue(value: IInstalledDesktopAppStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInstalledDesktopAppStatics {
    public val __178542361_Ptr: Pointer?

    public val _178542361_VtblPtr: Pointer?
      get() = __178542361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetInventoryAsync(): IAsyncOperation<IVectorView<InstalledDesktopApp?>?>? {
      val fnPtr = _178542361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<InstalledDesktopApp?>?>>()
      val hr = fn.invokeHR(arrayOf(__178542361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<InstalledDesktopApp?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IInstalledDesktopAppStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178542361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInstalledDesktopAppStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("264cf74e21cd5f9b60567866ad72489a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInstalledDesktopAppStatics(ptr: Pointer?): WithDefault =
        IInstalledDesktopAppStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInstalledDesktopAppStatics {
      val address = segment.toRawLongValue()
      return makeIInstalledDesktopAppStatics(Pointer(address))
    }

    public override fun toNative(obj: IInstalledDesktopAppStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178542361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInstalledDesktopAppStatics):
        Array<IInstalledDesktopAppStatics?> = (elements as
        Array<IInstalledDesktopAppStatics?>).castToImpl<IInstalledDesktopAppStatics,IInstalledDesktopAppStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInstalledDesktopAppStatics?> =
        arrayOfNulls<IInstalledDesktopAppStatics_Impl>(size) as Array<IInstalledDesktopAppStatics?>
  }
}
