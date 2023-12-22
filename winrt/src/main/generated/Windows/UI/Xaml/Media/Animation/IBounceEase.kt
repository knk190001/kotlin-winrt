package Windows.UI.Xaml.Media.Animation

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBounceEase.ABI::class)
@Signature("{2bf1464e-fc71-47ed-85a1-3ba9577718b4}")
@Guid("2bf1464efc7147ed85a13ba9577718b4")
@WinRTInterface("2bf1464efc7147ed85a13ba9577718b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBounceEase.ByReference::class)
public interface IBounceEase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bounces(): Int

  @InterfaceMethod(1)
  public fun put_Bounces(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Bounciness(): Double

  @InterfaceMethod(3)
  public fun put_Bounciness(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBounceEase> {
    public override fun getValue() = ABI.makeIBounceEase(pointer.getPointer(0))

    public fun setValue(value: IBounceEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBounceEase {
    public val __477445860_Ptr: Pointer?

    public val _477445860_VtblPtr: Pointer?
      get() = __477445860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounces(): Int {
      val fnPtr = _477445860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__477445860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Bounces(value: Int): Unit {
      val fnPtr = _477445860_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477445860_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bounciness(): Double {
      val fnPtr = _477445860_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__477445860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Bounciness(value: Double): Unit {
      val fnPtr = _477445860_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__477445860_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBounceEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __477445860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBounceEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bf1464efc7147ed85a13ba9577718b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBounceEase(ptr: Pointer?): WithDefault = IBounceEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBounceEase {
      val address = segment.toRawLongValue()
      return makeIBounceEase(Pointer(address))
    }

    public override fun toNative(obj: IBounceEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__477445860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBounceEase): Array<IBounceEase?> = (elements as
        Array<IBounceEase?>).castToImpl<IBounceEase,IBounceEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBounceEase?> =
        arrayOfNulls<IBounceEase_Impl>(size) as Array<IBounceEase?>
  }
}
