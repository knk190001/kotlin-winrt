package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivityFactory.ABI::class)
@Signature("{7c385758-361d-4a67-8a3b-34ca2978f9a3}")
@Guid("7c385758361d4a678a3b34ca2978f9a3")
@WinRTInterface("7c385758361d4a678a3b34ca2978f9a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityFactory.ByReference::class)
public interface IUserActivityFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithActivityId(activityId: String?): UserActivity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityFactory> {
    public override fun getValue() = ABI.makeIUserActivityFactory(pointer.getPointer(0))

    public fun setValue(value: IUserActivityFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityFactory {
    public val __1516913399_Ptr: Pointer?

    public val _1516913399_VtblPtr: Pointer?
      get() = __1516913399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithActivityId(activityId: String?): UserActivity? {
      val fnPtr = _1516913399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivity>()
      val hr = fn.invokeHR(arrayOf(__1516913399_Ptr, marshalToNative(activityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivity>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516913399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c385758361d4a678a3b34ca2978f9a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityFactory(ptr: Pointer?): WithDefault = IUserActivityFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityFactory {
      val address = segment.toRawLongValue()
      return makeIUserActivityFactory(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516913399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityFactory): Array<IUserActivityFactory?> =
        (elements as
        Array<IUserActivityFactory?>).castToImpl<IUserActivityFactory,IUserActivityFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityFactory?> =
        arrayOfNulls<IUserActivityFactory_Impl>(size) as Array<IUserActivityFactory?>
  }
}
