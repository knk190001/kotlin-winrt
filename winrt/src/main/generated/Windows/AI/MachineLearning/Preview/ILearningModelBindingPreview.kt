package Windows.AI.MachineLearning.Preview

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IPropertySet
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(ILearningModelBindingPreview.ABI::class)
@Guid("93c901e86c784b4faec1a6bb9e691624")
@WinRTByReference(ILearningModelBindingPreview.ByReference::class)
@TypeHash("__891028169_Type")
public interface ILearningModelBindingPreview : NativeMapped, IWinRTInterface, IMapView<String?,
    IUnknown?>, IIterable<IKeyValuePair<String?, IUnknown?>?> {
  public val __891028169_Ptr: Pointer?

  public val _891028169_VtblPtr: Pointer?
    get() = __891028169_Ptr?.getPointer(0)

  public override val __1676682589_Type: KType
    get() = IMapView::class.createType(listOf(
      KTypeProjection(INVARIANT,String::class.createType()),
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
        KTypeProjection(INVARIANT,IUnknown::class.createType()),
      ))),
    ))

  public fun Bind(name: String?, value: IUnknown?): Unit

  public fun Bind(
    name: String?,
    value: IUnknown?,
    metadata: IPropertySet?
  ): Unit

  public fun Clear(): Unit

  public interface WithDefault : ILearningModelBindingPreview {
    public override fun Bind(name: String?, value: IUnknown?): Unit {
      val fnPtr = _891028169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__891028169_Ptr,marshalToNative(name), marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun Bind(
      name: String?,
      value: IUnknown?,
      metadata: IPropertySet?
    ): Unit {
      val fnPtr = _891028169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__891028169_Ptr,marshalToNative(name), marshalToNative(value),
          marshalToNative(metadata)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun Clear(): Unit {
      val fnPtr = _891028169_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__891028169_Ptr,))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelBindingPreview> {
    public override fun getValue(): ILearningModelBindingPreview =
        ABI.makeILearningModelBindingPreview(pointer.getPointer(0))

    public fun setValue(value: ILearningModelBindingPreview): Unit {
      pointer = value.__891028169_Ptr!!
    }
  }

  public class ILearningModelBindingPreviewImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __891028169_Ptr: JNAPointer?
      get() = pointer

    public override val _891028169_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1676682589_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IMapView<String?, IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_891028169_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
          IUnknown?>?>>())
      val result = PointerByReference()
      IUnknownVtbl(_891028169_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): ILearningModelBindingPreview =
          ILearningModelBindingPreviewImpl(ptr)
    }
  }

  public object ABI : IABI<ILearningModelBindingPreview, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelBindingPreview(ptr: JNAPointer?) =
        ILearningModelBindingPreviewImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelBindingPreview {
      val address = segment.toRawLongValue()
      return makeILearningModelBindingPreview(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelBindingPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__891028169_Ptr))
  }
}
