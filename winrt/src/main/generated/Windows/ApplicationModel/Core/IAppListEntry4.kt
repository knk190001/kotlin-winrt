package Windows.ApplicationModel.Core

import Windows.ApplicationModel.AppInfo
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

@ABIMarker(IAppListEntry4.ABI::class)
@Signature("{2a131ed2-56f5-487c-8697-5166f3b33da0}")
@Guid("2a131ed256f5487c86975166f3b33da0")
@WinRTInterface("2a131ed256f5487c86975166f3b33da0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppListEntry4.ByReference::class)
public interface IAppListEntry4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppInfo(): AppInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppListEntry4>
      {
    public override fun getValue() = ABI.makeIAppListEntry4(pointer.getPointer(0))

    public fun setValue(value: IAppListEntry4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppListEntry4 {
    public val __40853281_Ptr: Pointer?

    public val _40853281_VtblPtr: Pointer?
      get() = __40853281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppInfo(): AppInfo? {
      val fnPtr = _40853281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__40853281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppListEntry4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __40853281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppListEntry4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a131ed256f5487c86975166f3b33da0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppListEntry4(ptr: Pointer?): WithDefault = IAppListEntry4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppListEntry4 {
      val address = segment.toRawLongValue()
      return makeIAppListEntry4(Pointer(address))
    }

    public override fun toNative(obj: IAppListEntry4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__40853281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry4): Array<IAppListEntry4?> = (elements as
        Array<IAppListEntry4?>).castToImpl<IAppListEntry4,IAppListEntry4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry4?> =
        arrayOfNulls<IAppListEntry4_Impl>(size) as Array<IAppListEntry4?>
  }
}
