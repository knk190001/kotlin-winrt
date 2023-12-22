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

@ABIMarker(IUserActivityVisualElements2.ABI::class)
@Signature("{caae7fc7-3eef-4359-825c-9d51b9220de3}")
@Guid("caae7fc73eef4359825c9d51b9220de3")
@WinRTInterface("caae7fc73eef4359825c9d51b9220de3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityVisualElements2.ByReference::class)
public interface IUserActivityVisualElements2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AttributionDisplayText(): String?

  @InterfaceMethod(1)
  public fun put_AttributionDisplayText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityVisualElements2> {
    public override fun getValue() = ABI.makeIUserActivityVisualElements2(pointer.getPointer(0))

    public fun setValue(value: IUserActivityVisualElements2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityVisualElements2 {
    public val __250493882_Ptr: Pointer?

    public val _250493882_VtblPtr: Pointer?
      get() = __250493882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AttributionDisplayText(): String? {
      val fnPtr = _250493882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__250493882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AttributionDisplayText(value: String?): Unit {
      val fnPtr = _250493882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__250493882_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserActivityVisualElements2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __250493882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityVisualElements2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("caae7fc73eef4359825c9d51b9220de3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityVisualElements2(ptr: Pointer?): WithDefault =
        IUserActivityVisualElements2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityVisualElements2 {
      val address = segment.toRawLongValue()
      return makeIUserActivityVisualElements2(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityVisualElements2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__250493882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityVisualElements2):
        Array<IUserActivityVisualElements2?> = (elements as
        Array<IUserActivityVisualElements2?>).castToImpl<IUserActivityVisualElements2,IUserActivityVisualElements2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityVisualElements2?> =
        arrayOfNulls<IUserActivityVisualElements2_Impl>(size) as
        Array<IUserActivityVisualElements2?>
  }
}
