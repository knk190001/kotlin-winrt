package Windows.Media.Devices

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHdrVideoControl.ABI::class)
@Signature("{55d8e2d0-30c0-43bf-9b9a-9799d70ced94}")
@Guid("55d8e2d030c043bf9b9a9799d70ced94")
@WinRTInterface("55d8e2d030c043bf9b9a9799d70ced94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHdrVideoControl.ByReference::class)
public interface IHdrVideoControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): IVectorView<HdrVideoMode?>?

  @InterfaceMethod(2)
  public fun get_Mode(): HdrVideoMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: HdrVideoMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHdrVideoControl> {
    public override fun getValue() = ABI.makeIHdrVideoControl(pointer.getPointer(0))

    public fun setValue(value: IHdrVideoControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHdrVideoControl {
    public val __242325705_Ptr: Pointer?

    public val _242325705_VtblPtr: Pointer?
      get() = __242325705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _242325705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__242325705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): IVectorView<HdrVideoMode?>? {
      val fnPtr = _242325705_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HdrVideoMode?>>()
      val hr = fn.invokeHR(arrayOf(__242325705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HdrVideoMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): HdrVideoMode? {
      val fnPtr = _242325705_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HdrVideoMode>()
      val hr = fn.invokeHR(arrayOf(__242325705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HdrVideoMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: HdrVideoMode?): Unit {
      val fnPtr = _242325705_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__242325705_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHdrVideoControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __242325705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHdrVideoControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55d8e2d030c043bf9b9a9799d70ced94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHdrVideoControl(ptr: Pointer?): WithDefault = IHdrVideoControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHdrVideoControl {
      val address = segment.toRawLongValue()
      return makeIHdrVideoControl(Pointer(address))
    }

    public override fun toNative(obj: IHdrVideoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__242325705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHdrVideoControl): Array<IHdrVideoControl?> = (elements as
        Array<IHdrVideoControl?>).castToImpl<IHdrVideoControl,IHdrVideoControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHdrVideoControl?> =
        arrayOfNulls<IHdrVideoControl_Impl>(size) as Array<IHdrVideoControl?>
  }
}
