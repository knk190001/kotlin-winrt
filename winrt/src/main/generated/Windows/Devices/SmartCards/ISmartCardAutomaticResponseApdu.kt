package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardAutomaticResponseApdu.ABI::class)
@Signature("{52152bab-c63e-4531-a857-d756d99b986a}")
@Guid("52152babc63e4531a857d756d99b986a")
@WinRTInterface("52152babc63e4531a857d756d99b986a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAutomaticResponseApdu.ByReference::class)
public interface ISmartCardAutomaticResponseApdu : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandApdu(): IBuffer?

  @InterfaceMethod(1)
  public fun put_CommandApdu(value: IBuffer?): Unit

  @InterfaceMethod(2)
  public fun get_CommandApduBitMask(): IBuffer?

  @InterfaceMethod(3)
  public fun put_CommandApduBitMask(value: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun get_ShouldMatchLength(): Boolean

  @InterfaceMethod(5)
  public fun put_ShouldMatchLength(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_AppletId(): IBuffer?

  @InterfaceMethod(7)
  public fun put_AppletId(value: IBuffer?): Unit

  @InterfaceMethod(8)
  public fun get_ResponseApdu(): IBuffer?

  @InterfaceMethod(9)
  public fun put_ResponseApdu(value: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAutomaticResponseApdu> {
    public override fun getValue() = ABI.makeISmartCardAutomaticResponseApdu(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAutomaticResponseApdu_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAutomaticResponseApdu {
    public val __816191194_Ptr: Pointer?

    public val _816191194_VtblPtr: Pointer?
      get() = __816191194_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandApdu(): IBuffer? {
      val fnPtr = _816191194_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CommandApdu(value: IBuffer?): Unit {
      val fnPtr = _816191194_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CommandApduBitMask(): IBuffer? {
      val fnPtr = _816191194_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CommandApduBitMask(value: IBuffer?): Unit {
      val fnPtr = _816191194_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ShouldMatchLength(): Boolean {
      val fnPtr = _816191194_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ShouldMatchLength(value: Boolean): Unit {
      val fnPtr = _816191194_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AppletId(): IBuffer? {
      val fnPtr = _816191194_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AppletId(value: IBuffer?): Unit {
      val fnPtr = _816191194_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ResponseApdu(): IBuffer? {
      val fnPtr = _816191194_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ResponseApdu(value: IBuffer?): Unit {
      val fnPtr = _816191194_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816191194_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardAutomaticResponseApdu_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __816191194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAutomaticResponseApdu, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52152babc63e4531a857d756d99b986a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAutomaticResponseApdu(ptr: Pointer?): WithDefault =
        ISmartCardAutomaticResponseApdu_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAutomaticResponseApdu {
      val address = segment.toRawLongValue()
      return makeISmartCardAutomaticResponseApdu(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAutomaticResponseApdu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__816191194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAutomaticResponseApdu):
        Array<ISmartCardAutomaticResponseApdu?> = (elements as
        Array<ISmartCardAutomaticResponseApdu?>).castToImpl<ISmartCardAutomaticResponseApdu,ISmartCardAutomaticResponseApdu_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAutomaticResponseApdu?> =
        arrayOfNulls<ISmartCardAutomaticResponseApdu_Impl>(size) as
        Array<ISmartCardAutomaticResponseApdu?>
  }
}
