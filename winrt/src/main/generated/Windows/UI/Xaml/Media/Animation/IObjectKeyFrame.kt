package Windows.UI.Xaml.Media.Animation

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IObjectKeyFrame.ABI::class)
@Signature("{9852a851-8593-48ee-a6a4-d5d4720f029a}")
@Guid("9852a851859348eea6a4d5d4720f029a")
@WinRTInterface("9852a851859348eea6a4d5d4720f029a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectKeyFrame.ByReference::class)
public interface IObjectKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Value(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_KeyTime(): KeyTime?

  @InterfaceMethod(3)
  public fun put_KeyTime(value: KeyTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectKeyFrame> {
    public override fun getValue() = ABI.makeIObjectKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IObjectKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectKeyFrame {
    public val __1985763891_Ptr: Pointer?

    public val _1985763891_VtblPtr: Pointer?
      get() = __1985763891_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _1985763891_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1985763891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: IUnknown?): Unit {
      val fnPtr = _1985763891_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1985763891_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyTime(): KeyTime? {
      val fnPtr = _1985763891_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTime>()
      val hr = fn.invokeHR(arrayOf(__1985763891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyTime(value: KeyTime?): Unit {
      val fnPtr = _1985763891_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1985763891_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IObjectKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1985763891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9852a851859348eea6a4d5d4720f029a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectKeyFrame(ptr: Pointer?): WithDefault = IObjectKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectKeyFrame {
      val address = segment.toRawLongValue()
      return makeIObjectKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IObjectKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1985763891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectKeyFrame): Array<IObjectKeyFrame?> = (elements as
        Array<IObjectKeyFrame?>).castToImpl<IObjectKeyFrame,IObjectKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectKeyFrame?> =
        arrayOfNulls<IObjectKeyFrame_Impl>(size) as Array<IObjectKeyFrame?>
  }
}
