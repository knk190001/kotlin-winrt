package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IAppInstallManager5.ABI::class)
@Signature("{3cd7be4c-1be9-4f7f-b675-aa1d64a529b2}")
@Guid("3cd7be4c1be94f7fb675aa1d64a529b2")
@WinRTInterface("3cd7be4c1be94f7fb675aa1d64a529b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager5.ByReference::class)
public interface IAppInstallManager5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppInstallItemsWithGroupSupport(): IVectorView<AppInstallItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager5> {
    public override fun getValue() = ABI.makeIAppInstallManager5(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager5 {
    public val __697290132_Ptr: Pointer?

    public val _697290132_VtblPtr: Pointer?
      get() = __697290132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppInstallItemsWithGroupSupport(): IVectorView<AppInstallItem?>? {
      val fnPtr = _697290132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__697290132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppInstallItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallManager5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cd7be4c1be94f7fb675aa1d64a529b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager5(ptr: Pointer?): WithDefault = IAppInstallManager5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager5 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager5(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager5): Array<IAppInstallManager5?> =
        (elements as
        Array<IAppInstallManager5?>).castToImpl<IAppInstallManager5,IAppInstallManager5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager5?> =
        arrayOfNulls<IAppInstallManager5_Impl>(size) as Array<IAppInstallManager5?>
  }
}
