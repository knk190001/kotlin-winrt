package Windows.Media.Core

import Windows.Media.Core.ITimedMetadataTrackFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(TimedMetadataTrack.ABI::class)
@Signature("rc(Windows.Media.Core.TimedMetadataTrack;{9e6aed9e-f67a-49a9-b330-cf03b0e9cf07})")
@WinRTByReference(brClass = TimedMetadataTrack.ByReference::class)
public class TimedMetadataTrack(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedMetadataTrack.WithDefault, IMediaTrack.WithDefault,
    ITimedMetadataTrack2.WithDefault, IWinRTObject {
  private val __771862778_Interface: ITimedMetadataTrack.WithDefault by lazy {
    as_771862778()
  }


  private val __1836839004_Interface: IMediaTrack.WithDefault by lazy {
    as_1836839004()
  }


  private val __1842057608_Interface: ITimedMetadataTrack2.WithDefault by lazy {
    as_1842057608()
  }


  public override val __771862778_Ptr: JNAPointer? by lazy {
    __771862778_Interface.__771862778_Ptr
  }


  public override val __1836839004_Ptr: JNAPointer? by lazy {
    __1836839004_Interface.__1836839004_Ptr
  }


  public override val __1842057608_Ptr: JNAPointer? by lazy {
    __1842057608_Interface.__1842057608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__771862778_Interface, __1836839004_Interface, __1842057608_Interface)

  public constructor(
    id: String,
    language: String,
    kind: TimedMetadataKind
  ) : this(ABI.activate(id, language, kind))

  private fun as_771862778(): ITimedMetadataTrack.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataTrack.ABI.makeITimedMetadataTrack(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataTrack>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataTrack.ABI.makeITimedMetadataTrack(ref.value))
  }

  private fun as_1836839004(): IMediaTrack.WithDefault {
    if(pointer == NULL) {
      return(IMediaTrack.ABI.makeIMediaTrack(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTrack>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTrack.ABI.makeIMediaTrack(ref.value))
  }

  private fun as_1842057608(): ITimedMetadataTrack2.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataTrack2.ABI.makeITimedMetadataTrack2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataTrack2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataTrack2.ABI.makeITimedMetadataTrack2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedMetadataTrack> {
    public override fun getValue() = TimedMetadataTrack(pointer.getPointer(0))

    public fun setValue(value: TimedMetadataTrack): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedMetadataTrack, MemoryAddress> {
    public val ITimedMetadataTrackFactory_Instance: ITimedMetadataTrackFactory by lazy {
      createITimedMetadataTrackFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimedMetadataTrackFactory(): ITimedMetadataTrackFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedMetadataTrack".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimedMetadataTrackFactory.ABI.makeITimedMetadataTrackFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      id: String,
      language: String,
      kind: TimedMetadataKind
    ): JNAPointer? = ITimedMetadataTrackFactory_Instance.Create(id, language, kind)?.pointer

    public override fun fromNative(segment: MemoryAddress): TimedMetadataTrack {
      val address = segment.toRawLongValue()
      return TimedMetadataTrack(Pointer(address))
    }

    public override fun toNative(obj: TimedMetadataTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
