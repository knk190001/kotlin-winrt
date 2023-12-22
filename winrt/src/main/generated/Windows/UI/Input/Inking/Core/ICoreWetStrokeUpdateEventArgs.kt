package Windows.UI.Input.Inking.Core

import Windows.Foundation.Collections.IVector
import Windows.UI.Input.Inking.InkPoint
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

@ABIMarker(ICoreWetStrokeUpdateEventArgs.ABI::class)
@Signature("{fb07d14c-3380-457a-a987-991357896c1b}")
@Guid("fb07d14c3380457aa987991357896c1b")
@WinRTInterface("fb07d14c3380457aa987991357896c1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWetStrokeUpdateEventArgs.ByReference::class)
public interface ICoreWetStrokeUpdateEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewInkPoints(): IVector<InkPoint?>?

  @InterfaceMethod(1)
  public fun get_PointerId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Disposition(): CoreWetStrokeDisposition?

  @InterfaceMethod(3)
  public fun put_Disposition(value: CoreWetStrokeDisposition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWetStrokeUpdateEventArgs> {
    public override fun getValue() = ABI.makeICoreWetStrokeUpdateEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWetStrokeUpdateEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWetStrokeUpdateEventArgs {
    public val __287931014_Ptr: Pointer?

    public val _287931014_VtblPtr: Pointer?
      get() = __287931014_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewInkPoints(): IVector<InkPoint?>? {
      val fnPtr = _287931014_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<InkPoint?>>()
      val hr = fn.invokeHR(arrayOf(__287931014_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<InkPoint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointerId(): WinDef.UINT {
      val fnPtr = _287931014_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__287931014_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Disposition(): CoreWetStrokeDisposition? {
      val fnPtr = _287931014_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWetStrokeDisposition>()
      val hr = fn.invokeHR(arrayOf(__287931014_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWetStrokeDisposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Disposition(value: CoreWetStrokeDisposition?): Unit {
      val fnPtr = _287931014_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__287931014_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWetStrokeUpdateEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __287931014_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWetStrokeUpdateEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb07d14c3380457aa987991357896c1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWetStrokeUpdateEventArgs(ptr: Pointer?): WithDefault =
        ICoreWetStrokeUpdateEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWetStrokeUpdateEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWetStrokeUpdateEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWetStrokeUpdateEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__287931014_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWetStrokeUpdateEventArgs):
        Array<ICoreWetStrokeUpdateEventArgs?> = (elements as
        Array<ICoreWetStrokeUpdateEventArgs?>).castToImpl<ICoreWetStrokeUpdateEventArgs,ICoreWetStrokeUpdateEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWetStrokeUpdateEventArgs?> =
        arrayOfNulls<ICoreWetStrokeUpdateEventArgs_Impl>(size) as
        Array<ICoreWetStrokeUpdateEventArgs?>
  }
}
