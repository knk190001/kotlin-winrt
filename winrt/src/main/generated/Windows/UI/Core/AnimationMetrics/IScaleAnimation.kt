package Windows.UI.Core.AnimationMetrics

import Windows.Foundation.IReference
import Windows.Foundation.Point
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

@ABIMarker(IScaleAnimation.ABI::class)
@Signature("{023552c7-71ab-428c-9c9f-d31780964995}")
@Guid("023552c771ab428c9c9fd31780964995")
@WinRTInterface("023552c771ab428c9c9fd31780964995")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScaleAnimation.ByReference::class)
public interface IScaleAnimation : NativeMapped, IWinRTInterface, IPropertyAnimation {
  @InterfaceMethod(0)
  public fun get_InitialScaleX(): IReference<Float>?

  @InterfaceMethod(1)
  public fun get_InitialScaleY(): IReference<Float>?

  @InterfaceMethod(2)
  public fun get_FinalScaleX(): Float

  @InterfaceMethod(3)
  public fun get_FinalScaleY(): Float

  @InterfaceMethod(4)
  public fun get_NormalizedOrigin(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScaleAnimation> {
    public override fun getValue() = ABI.makeIScaleAnimation(pointer.getPointer(0))

    public fun setValue(value: IScaleAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScaleAnimation, IPropertyAnimation.WithDefault {
    public val __1390433340_Ptr: Pointer?

    public val _1390433340_VtblPtr: Pointer?
      get() = __1390433340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialScaleX(): IReference<Float>? {
      val fnPtr = _1390433340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1390433340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InitialScaleY(): IReference<Float>? {
      val fnPtr = _1390433340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1390433340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FinalScaleX(): Float {
      val fnPtr = _1390433340_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1390433340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_FinalScaleY(): Float {
      val fnPtr = _1390433340_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1390433340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_NormalizedOrigin(): Point? {
      val fnPtr = _1390433340_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1390433340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IScaleAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPropertyAnimation {
    public override val __359196293_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1390433340_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1390433340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScaleAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("023552c771ab428c9c9fd31780964995")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScaleAnimation(ptr: Pointer?): WithDefault = IScaleAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScaleAnimation {
      val address = segment.toRawLongValue()
      return makeIScaleAnimation(Pointer(address))
    }

    public override fun toNative(obj: IScaleAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1390433340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScaleAnimation): Array<IScaleAnimation?> = (elements as
        Array<IScaleAnimation?>).castToImpl<IScaleAnimation,IScaleAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScaleAnimation?> =
        arrayOfNulls<IScaleAnimation_Impl>(size) as Array<IScaleAnimation?>
  }
}
