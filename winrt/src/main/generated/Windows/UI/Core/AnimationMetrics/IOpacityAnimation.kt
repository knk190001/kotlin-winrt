package Windows.UI.Core.AnimationMetrics

import Windows.Foundation.IReference
import Windows.UI.Core.AnimationMetrics.IPropertyAnimation.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOpacityAnimation.ABI::class)
@Signature("{803aabe5-ee7e-455f-84e9-2506afb8d2b4}")
@Guid("803aabe5ee7e455f84e92506afb8d2b4")
@WinRTInterface("803aabe5ee7e455f84e92506afb8d2b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOpacityAnimation.ByReference::class)
public interface IOpacityAnimation : NativeMapped, IWinRTInterface, IPropertyAnimation {
  @InterfaceMethod(0)
  public fun get_InitialOpacity(): IReference<Float>?

  @InterfaceMethod(1)
  public fun get_FinalOpacity(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOpacityAnimation> {
    public override fun getValue() = ABI.makeIOpacityAnimation(pointer.getPointer(0))

    public fun setValue(value: IOpacityAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOpacityAnimation, IPropertyAnimation.WithDefault {
    public val __1432038493_Ptr: Pointer?

    public val _1432038493_VtblPtr: Pointer?
      get() = __1432038493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialOpacity(): IReference<Float>? {
      val fnPtr = _1432038493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1432038493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FinalOpacity(): Float {
      val fnPtr = _1432038493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1432038493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IOpacityAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPropertyAnimation {
    public override val __359196293_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1432038493_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1432038493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOpacityAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("803aabe5ee7e455f84e92506afb8d2b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOpacityAnimation(ptr: Pointer?): WithDefault = IOpacityAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOpacityAnimation {
      val address = segment.toRawLongValue()
      return makeIOpacityAnimation(Pointer(address))
    }

    public override fun toNative(obj: IOpacityAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432038493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOpacityAnimation): Array<IOpacityAnimation?> = (elements
        as Array<IOpacityAnimation?>).castToImpl<IOpacityAnimation,IOpacityAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOpacityAnimation?> =
        arrayOfNulls<IOpacityAnimation_Impl>(size) as Array<IOpacityAnimation?>
  }
}
