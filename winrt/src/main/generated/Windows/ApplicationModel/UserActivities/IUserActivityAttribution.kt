package Windows.ApplicationModel.UserActivities

import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserActivityAttribution.ABI::class)
@Signature("{34a5c8b5-86dd-4aec-a491-6a4faea5d22e}")
@Guid("34a5c8b586dd4aeca4916a4faea5d22e")
@WinRTInterface("34a5c8b586dd4aeca4916a4faea5d22e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityAttribution.ByReference::class)
public interface IUserActivityAttribution : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconUri(): Uri?

  @InterfaceMethod(1)
  public fun put_IconUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_AlternateText(): String?

  @InterfaceMethod(3)
  public fun put_AlternateText(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_AddImageQuery(): Boolean

  @InterfaceMethod(5)
  public fun put_AddImageQuery(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityAttribution> {
    public override fun getValue() = ABI.makeIUserActivityAttribution(pointer.getPointer(0))

    public fun setValue(value: IUserActivityAttribution_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityAttribution {
    public val __603849982_Ptr: Pointer?

    public val _603849982_VtblPtr: Pointer?
      get() = __603849982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconUri(): Uri? {
      val fnPtr = _603849982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IconUri(value: Uri?): Unit {
      val fnPtr = _603849982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AlternateText(): String? {
      val fnPtr = _603849982_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AlternateText(value: String?): Unit {
      val fnPtr = _603849982_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AddImageQuery(): Boolean {
      val fnPtr = _603849982_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AddImageQuery(value: Boolean): Unit {
      val fnPtr = _603849982_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__603849982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserActivityAttribution_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __603849982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityAttribution, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34a5c8b586dd4aeca4916a4faea5d22e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityAttribution(ptr: Pointer?): WithDefault =
        IUserActivityAttribution_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityAttribution {
      val address = segment.toRawLongValue()
      return makeIUserActivityAttribution(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityAttribution): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__603849982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityAttribution):
        Array<IUserActivityAttribution?> = (elements as
        Array<IUserActivityAttribution?>).castToImpl<IUserActivityAttribution,IUserActivityAttribution_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityAttribution?> =
        arrayOfNulls<IUserActivityAttribution_Impl>(size) as Array<IUserActivityAttribution?>
  }
}
