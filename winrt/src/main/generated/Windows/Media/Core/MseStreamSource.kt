package Windows.Media.Core

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MseStreamSource.ABI::class)
@Signature("rc(Windows.Media.Core.MseStreamSource;{b0b4198d-02f4-4923-88dd-81bc3f360ffa})")
@WinRTByReference(brClass = MseStreamSource.ByReference::class)
public class MseStreamSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMseStreamSource.WithDefault, IMediaSource.WithDefault,
    IMseStreamSource2.WithDefault, IWinRTObject {
  private val __1555055259_Interface: IMseStreamSource.WithDefault by lazy {
    as_1555055259()
  }


  private val __1076644650_Interface: IMediaSource.WithDefault by lazy {
    as_1076644650()
  }


  private val __962072723_Interface: IMseStreamSource2.WithDefault by lazy {
    as_962072723()
  }


  public override val __1555055259_Ptr: JNAPointer? by lazy {
    __1555055259_Interface.__1555055259_Ptr
  }


  public override val __1076644650_Ptr: JNAPointer? by lazy {
    __1076644650_Interface.__1076644650_Ptr
  }


  public override val __962072723_Ptr: JNAPointer? by lazy {
    __962072723_Interface.__962072723_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1555055259_Interface, __1076644650_Interface, __962072723_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1555055259(): IMseStreamSource.WithDefault {
    if(pointer == NULL) {
      return(IMseStreamSource.ABI.makeIMseStreamSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMseStreamSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMseStreamSource.ABI.makeIMseStreamSource(ref.value))
  }

  private fun as_1076644650(): IMediaSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource.ABI.makeIMediaSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource.ABI.makeIMediaSource(ref.value))
  }

  private fun as_962072723(): IMseStreamSource2.WithDefault {
    if(pointer == NULL) {
      return(IMseStreamSource2.ABI.makeIMseStreamSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMseStreamSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMseStreamSource2.ABI.makeIMseStreamSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MseStreamSource> {
    public override fun getValue() = MseStreamSource(pointer.getPointer(0))

    public fun setValue(value: MseStreamSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MseStreamSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMseStreamSourceStatics_Instance: IMseStreamSourceStatics by lazy {
      createIMseStreamSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.MseStreamSource".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIMseStreamSourceStatics(): IMseStreamSourceStatics {
      val refiid = Guid.REFIID(IMseStreamSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MseStreamSource".toHandle(),refiid,interfacePtr)
      val result = IMseStreamSourceStatics.ABI.makeIMseStreamSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MseStreamSource {
      val address = segment.toRawLongValue()
      return MseStreamSource(Pointer(address))
    }

    public override fun toNative(obj: MseStreamSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsContentTypeSupported(contentType: String) =
        ABI.IMseStreamSourceStatics_Instance.IsContentTypeSupported(contentType)
  }
}
