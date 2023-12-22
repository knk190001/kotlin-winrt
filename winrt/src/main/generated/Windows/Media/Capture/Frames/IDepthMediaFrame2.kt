package Windows.Media.Capture.Frames

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

@ABIMarker(IDepthMediaFrame2.ABI::class)
@Signature("{6cca473d-c4a4-4176-b0cd-33eae3b35aa3}")
@Guid("6cca473dc4a44176b0cd33eae3b35aa3")
@WinRTInterface("6cca473dc4a44176b0cd33eae3b35aa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDepthMediaFrame2.ByReference::class)
public interface IDepthMediaFrame2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxReliableDepth(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_MinReliableDepth(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDepthMediaFrame2> {
    public override fun getValue() = ABI.makeIDepthMediaFrame2(pointer.getPointer(0))

    public fun setValue(value: IDepthMediaFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDepthMediaFrame2 {
    public val __1470554316_Ptr: Pointer?

    public val _1470554316_VtblPtr: Pointer?
      get() = __1470554316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxReliableDepth(): WinDef.UINT {
      val fnPtr = _1470554316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1470554316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MinReliableDepth(): WinDef.UINT {
      val fnPtr = _1470554316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1470554316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IDepthMediaFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1470554316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDepthMediaFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cca473dc4a44176b0cd33eae3b35aa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDepthMediaFrame2(ptr: Pointer?): WithDefault = IDepthMediaFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDepthMediaFrame2 {
      val address = segment.toRawLongValue()
      return makeIDepthMediaFrame2(Pointer(address))
    }

    public override fun toNative(obj: IDepthMediaFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1470554316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDepthMediaFrame2): Array<IDepthMediaFrame2?> = (elements
        as Array<IDepthMediaFrame2?>).castToImpl<IDepthMediaFrame2,IDepthMediaFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDepthMediaFrame2?> =
        arrayOfNulls<IDepthMediaFrame2_Impl>(size) as Array<IDepthMediaFrame2?>
  }
}
