package Windows.Services.Maps.Guidance

import Windows.Foundation.Collections.IVectorView
import Windows.UI.Color
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

@ABIMarker(IGuidanceRoadSignpost.ABI::class)
@Signature("{f1a728b6-f77a-4742-8312-53300f9845f0}")
@Guid("f1a728b6f77a4742831253300f9845f0")
@WinRTInterface("f1a728b6f77a4742831253300f9845f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceRoadSignpost.ByReference::class)
public interface IGuidanceRoadSignpost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExitNumber(): String?

  @InterfaceMethod(1)
  public fun get_Exit(): String?

  @InterfaceMethod(2)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(3)
  public fun get_ForegroundColor(): Color?

  @InterfaceMethod(4)
  public fun get_ExitDirections(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceRoadSignpost> {
    public override fun getValue() = ABI.makeIGuidanceRoadSignpost(pointer.getPointer(0))

    public fun setValue(value: IGuidanceRoadSignpost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceRoadSignpost {
    public val __957126796_Ptr: Pointer?

    public val _957126796_VtblPtr: Pointer?
      get() = __957126796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExitNumber(): String? {
      val fnPtr = _957126796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__957126796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Exit(): String? {
      val fnPtr = _957126796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__957126796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _957126796_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__957126796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ForegroundColor(): Color? {
      val fnPtr = _957126796_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__957126796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExitDirections(): IVectorView<String?>? {
      val fnPtr = _957126796_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__957126796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceRoadSignpost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __957126796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceRoadSignpost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1a728b6f77a4742831253300f9845f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceRoadSignpost(ptr: Pointer?): WithDefault =
        IGuidanceRoadSignpost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceRoadSignpost {
      val address = segment.toRawLongValue()
      return makeIGuidanceRoadSignpost(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceRoadSignpost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__957126796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceRoadSignpost): Array<IGuidanceRoadSignpost?> =
        (elements as
        Array<IGuidanceRoadSignpost?>).castToImpl<IGuidanceRoadSignpost,IGuidanceRoadSignpost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceRoadSignpost?> =
        arrayOfNulls<IGuidanceRoadSignpost_Impl>(size) as Array<IGuidanceRoadSignpost?>
  }
}
