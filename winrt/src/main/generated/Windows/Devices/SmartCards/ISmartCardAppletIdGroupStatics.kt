package Windows.Devices.SmartCards

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmartCardAppletIdGroupStatics.ABI::class)
@Signature("{ab2899a9-e76c-45cf-bf1d-90eaa6205927}")
@Guid("ab2899a9e76c45cfbf1d90eaa6205927")
@WinRTInterface("ab2899a9e76c45cfbf1d90eaa6205927")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAppletIdGroupStatics.ByReference::class)
public interface ISmartCardAppletIdGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxAppletIds(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAppletIdGroupStatics> {
    public override fun getValue() = ABI.makeISmartCardAppletIdGroupStatics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAppletIdGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAppletIdGroupStatics {
    public val __1918274113_Ptr: Pointer?

    public val _1918274113_VtblPtr: Pointer?
      get() = __1918274113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxAppletIds(): WinDef.USHORT {
      val fnPtr = _1918274113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1918274113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardAppletIdGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1918274113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAppletIdGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab2899a9e76c45cfbf1d90eaa6205927")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAppletIdGroupStatics(ptr: Pointer?): WithDefault =
        ISmartCardAppletIdGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAppletIdGroupStatics {
      val address = segment.toRawLongValue()
      return makeISmartCardAppletIdGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAppletIdGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1918274113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAppletIdGroupStatics):
        Array<ISmartCardAppletIdGroupStatics?> = (elements as
        Array<ISmartCardAppletIdGroupStatics?>).castToImpl<ISmartCardAppletIdGroupStatics,ISmartCardAppletIdGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAppletIdGroupStatics?> =
        arrayOfNulls<ISmartCardAppletIdGroupStatics_Impl>(size) as
        Array<ISmartCardAppletIdGroupStatics?>
  }
}
