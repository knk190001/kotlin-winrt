package Windows.System.Profile

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRetailInfoStatics.ABI::class)
@Signature("{0712c6b8-8b92-4f2a-8499-031f1798d6ef}")
@Guid("0712c6b88b924f2a8499031f1798d6ef")
@WinRTInterface("0712c6b88b924f2a8499031f1798d6ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRetailInfoStatics.ByReference::class)
public interface IRetailInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDemoModeEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRetailInfoStatics> {
    public override fun getValue() = ABI.makeIRetailInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IRetailInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRetailInfoStatics {
    public val __1264532096_Ptr: Pointer?

    public val _1264532096_VtblPtr: Pointer?
      get() = __1264532096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDemoModeEnabled(): Boolean {
      val fnPtr = _1264532096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1264532096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1264532096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1264532096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IRetailInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1264532096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRetailInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0712c6b88b924f2a8499031f1798d6ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRetailInfoStatics(ptr: Pointer?): WithDefault = IRetailInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRetailInfoStatics {
      val address = segment.toRawLongValue()
      return makeIRetailInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IRetailInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1264532096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRetailInfoStatics): Array<IRetailInfoStatics?> =
        (elements as
        Array<IRetailInfoStatics?>).castToImpl<IRetailInfoStatics,IRetailInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRetailInfoStatics?> =
        arrayOfNulls<IRetailInfoStatics_Impl>(size) as Array<IRetailInfoStatics?>
  }
}
